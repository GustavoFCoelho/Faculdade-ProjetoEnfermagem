package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Agenda;
import Projeto.Enfermagem.projEnf.models.model.AgendaModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AgendaEntityConverter extends EntityConverter<Agenda, AgendaModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected Agenda toEntityImpl(AgendaModel model) {
        return mapperUtil.use().map(model, Agenda.class);
    }

    @Override
    protected AgendaModel toModelImpl(Agenda entity) {
        return mapperUtil.use().map(entity, AgendaModel.class);
    }
}
