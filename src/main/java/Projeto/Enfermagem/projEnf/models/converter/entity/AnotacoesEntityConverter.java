package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Anotacoes;
import Projeto.Enfermagem.projEnf.models.model.AnotacoesModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnotacoesEntityConverter extends EntityConverter<Anotacoes, AnotacoesModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected Anotacoes toEntityImpl(AnotacoesModel model) {
        return mapperUtil.use().map(model, Anotacoes.class);
    }

    @Override
    protected AnotacoesModel toModelImpl(Anotacoes entity) {
        return mapperUtil.use().map(entity, AnotacoesModel.class);
    }
}
