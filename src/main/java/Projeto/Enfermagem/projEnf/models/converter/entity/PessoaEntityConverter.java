package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Pessoa;
import Projeto.Enfermagem.projEnf.models.model.PessoaModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PessoaEntityConverter extends EntityConverter<Pessoa, PessoaModel> {

    private final MapperUtil mapperUtil;
    @Override
    protected Pessoa toEntityImpl(PessoaModel model) {
        return mapperUtil.use().map(model, Pessoa.class);
    }

    @Override
    protected PessoaModel toModelImpl(Pessoa entity) {
        return mapperUtil.use().map(entity, PessoaModel.class);
    }
}
