package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.MedicamentoDTO;
import Projeto.Enfermagem.projEnf.models.model.MedicamentoModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MedicamentoDTOConverter extends DTOConverter<MedicamentoDTO, MedicamentoModel> {

    private final MapperUtil mapperUtil;

    @Override
    protected MedicamentoDTO toDTOImpl(MedicamentoModel model) {
        return mapperUtil.use().map(model, MedicamentoDTO.class);
    }

    @Override
    protected MedicamentoModel toModelImpl(MedicamentoDTO dto) {
        return mapperUtil.use().map(dto, MedicamentoModel.class);
    }
}
