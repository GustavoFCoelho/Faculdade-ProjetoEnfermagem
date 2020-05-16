package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.UserDTO;
import Projeto.Enfermagem.projEnf.models.model.UserModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserDTOConverter extends DTOConverter<UserDTO, UserModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected UserDTO toDTOImpl(UserModel model) {
        return mapperUtil.use().map(model, UserDTO.class);
    }

    @Override
    protected UserModel toModelImpl(UserDTO dto) {
        return mapperUtil.use().map(dto, UserModel.class);
    }
}
