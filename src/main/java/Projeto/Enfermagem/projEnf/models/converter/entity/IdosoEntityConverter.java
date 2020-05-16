package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Idoso;
import Projeto.Enfermagem.projEnf.models.model.IdosoModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class IdosoEntityConverter extends EntityConverter<Idoso, IdosoModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected Idoso toEntityImpl(IdosoModel model) {
        return mapperUtil.use().map(model, Idoso.class);
    }

    @Override
    protected IdosoModel toModelImpl(Idoso entity) {
        return mapperUtil.use().map(entity, IdosoModel.class);
    }
}
