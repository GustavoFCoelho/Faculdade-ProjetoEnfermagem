package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.impl.MedicamentoDatastore;
import Projeto.Enfermagem.projEnf.models.model.MedicamentoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicamentoService {

    private final MedicamentoDatastore datastore;

    public MedicamentoModel save(MedicamentoModel model) {
        return datastore.salvar(model);
    }

    public List<MedicamentoModel> getAll(){
        return datastore.buscarTodos();
    }
}
