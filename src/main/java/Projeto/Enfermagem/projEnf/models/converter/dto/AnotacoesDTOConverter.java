package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.AnotacoesDTO;
import Projeto.Enfermagem.projEnf.models.model.AnotacoesModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnotacoesDTOConverter extends DTOConverter<AnotacoesDTO, AnotacoesModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected AnotacoesDTO toDTOImpl(AnotacoesModel model) {
        return mapperUtil.use().map(model, AnotacoesDTO.class);
    }

    @Override
    protected AnotacoesModel toModelImpl(AnotacoesDTO dto) {
        return mapperUtil.use().map(dto, AnotacoesModel.class);
    }
}
