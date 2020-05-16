package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.repository.MedicamentoRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.MedicamentoEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.MedicamentoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class MedicamentoDatastore {
    private final MedicamentoRepository repository;
    private final MedicamentoEntityConverter converter;

    public MedicamentoModel salvar(MedicamentoModel model){
        return converter.toModel(repository.save(converter.toEntity(model)));
    }

    public List<MedicamentoModel> buscarTodos(){
        return converter.toModelList(repository.findAll());
    }
}
