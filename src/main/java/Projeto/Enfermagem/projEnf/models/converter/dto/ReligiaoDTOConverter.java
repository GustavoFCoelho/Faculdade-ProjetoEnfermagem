package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.ReligiaoDTO;
import Projeto.Enfermagem.projEnf.models.model.ReligiaoModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReligiaoDTOConverter extends DTOConverter<ReligiaoDTO, ReligiaoModel> {

    private final MapperUtil mapperUtil;

    @Override
    protected ReligiaoDTO toDTOImpl(ReligiaoModel model) {
        return mapperUtil.use().map(model, ReligiaoDTO.class);
    }

    @Override
    protected ReligiaoModel toModelImpl(ReligiaoDTO dto) {
        return mapperUtil.use().map(dto, ReligiaoModel.class);
    }
}
