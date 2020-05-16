package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.IdosoDTO;
import Projeto.Enfermagem.projEnf.models.model.IdosoModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class IdosoDTOConverter extends DTOConverter<IdosoDTO, IdosoModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected IdosoDTO toDTOImpl(IdosoModel model) {
        return mapperUtil.use().map(model, IdosoDTO.class);
    }

    @Override
    protected IdosoModel toModelImpl(IdosoDTO dto) {
        return mapperUtil.use().map(dto, IdosoModel.class);
    }
}
