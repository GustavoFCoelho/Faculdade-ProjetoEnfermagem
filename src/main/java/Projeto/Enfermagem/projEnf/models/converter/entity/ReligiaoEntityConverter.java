package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Religiao;
import Projeto.Enfermagem.projEnf.models.model.ReligiaoModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReligiaoEntityConverter extends EntityConverter<Religiao, ReligiaoModel> {
    private final MapperUtil mapperUtil;

    @Override
    protected Religiao toEntityImpl(ReligiaoModel model) {
        return mapperUtil.use().map(model, Religiao.class);
    }

    @Override
    protected ReligiaoModel toModelImpl(Religiao entity) {
        return mapperUtil.use().map(entity, ReligiaoModel.class);
    }
}
