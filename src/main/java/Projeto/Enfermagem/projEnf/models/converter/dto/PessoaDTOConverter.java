package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.PessoaDTO;
import Projeto.Enfermagem.projEnf.models.model.PessoaModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.DTOConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PessoaDTOConverter extends DTOConverter<PessoaDTO, PessoaModel> {
    private final MapperUtil mapperUtil;

    @Override
    protected PessoaDTO toDTOImpl(PessoaModel model) {
        return mapperUtil.use().map(model, PessoaDTO.class);
    }

    @Override
    protected PessoaModel toModelImpl(PessoaDTO dto) {
        return mapperUtil.use().map(dto, PessoaModel.class);
    }
}
