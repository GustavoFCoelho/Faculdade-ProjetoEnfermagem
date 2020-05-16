package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Medicamento;
import Projeto.Enfermagem.projEnf.models.model.MedicamentoModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MedicamentoEntityConverter extends EntityConverter<Medicamento, MedicamentoModel> {

    private final MapperUtil mapperUtil;

    @Override
    protected Medicamento toEntityImpl(MedicamentoModel model) {
        return mapperUtil.use().map(model, Medicamento.class);
    }

    @Override
    protected MedicamentoModel toModelImpl(Medicamento entity) {
        return mapperUtil.use().map(entity, MedicamentoModel.class);
    }
}
