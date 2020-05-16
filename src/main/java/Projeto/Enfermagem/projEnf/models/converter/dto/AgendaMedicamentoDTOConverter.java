package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.AgendaMedicamentosDTO;
import Projeto.Enfermagem.projEnf.models.model.AgendaMedicamentosModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AgendaMedicamentoDTOConverter extends DTOConverter<AgendaMedicamentosDTO, AgendaMedicamentosModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected AgendaMedicamentosDTO toDTOImpl(AgendaMedicamentosModel model) {
        return mapperUtil.use().map(model, AgendaMedicamentosDTO.class);
    }

    @Override
    protected AgendaMedicamentosModel toModelImpl(AgendaMedicamentosDTO dto) {
        return mapperUtil.use().map(dto, AgendaMedicamentosModel.class);
    }
}
