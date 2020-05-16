package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Responsavel;
import Projeto.Enfermagem.projEnf.models.model.ResponsavelModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ResponsavelEntityConverter extends EntityConverter<Responsavel, ResponsavelModel> {

    private final MapperUtil mapperUtil;

    @Override
    protected Responsavel toEntityImpl(ResponsavelModel model) {
        return mapperUtil.use().map(model, Responsavel.class);
    }

    @Override
    protected ResponsavelModel toModelImpl(Responsavel entity) {
        return mapperUtil.use().map(entity, ResponsavelModel.class);
    }
}
