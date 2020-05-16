package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.ResponsavelDTO;
import Projeto.Enfermagem.projEnf.models.model.ResponsavelModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ResponsavelDTOConverter extends DTOConverter<ResponsavelDTO, ResponsavelModel> {

    private final MapperUtil mapperUtil;

    @Override
    protected ResponsavelDTO toDTOImpl(ResponsavelModel model) {
        return mapperUtil.use().map(model, ResponsavelDTO.class);
    }

    @Override
    protected ResponsavelModel toModelImpl(ResponsavelDTO dto) {
        return mapperUtil.use().map(dto, ResponsavelModel.class);
    }
}
