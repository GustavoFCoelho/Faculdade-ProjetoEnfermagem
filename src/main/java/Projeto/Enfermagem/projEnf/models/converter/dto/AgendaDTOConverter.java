package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.AgendaDTO;
import Projeto.Enfermagem.projEnf.models.model.AgendaModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AgendaDTOConverter extends DTOConverter<AgendaDTO, AgendaModel> {

    private final MapperUtil mapperUtil;

    @Override
    protected AgendaDTO toDTOImpl(AgendaModel model) {
        return mapperUtil.use().map(model, AgendaDTO.class);
    }

    @Override
    protected AgendaModel toModelImpl(AgendaDTO dto) {
        return mapperUtil.use().map(dto, AgendaModel.class);
    }
}
