package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.AgendaMedicamentos;
import Projeto.Enfermagem.projEnf.models.model.AgendaMedicamentosModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AgendaMedicamentoEntityConverter extends EntityConverter<AgendaMedicamentos, AgendaMedicamentosModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected AgendaMedicamentos toEntityImpl(AgendaMedicamentosModel model) {
        return mapperUtil.use().map(model, AgendaMedicamentos.class);
    }

    @Override
    protected AgendaMedicamentosModel toModelImpl(AgendaMedicamentos entity) {
        return mapperUtil.use().map(entity, AgendaMedicamentosModel.class);
    }
}
