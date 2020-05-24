package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.impl.ResponsavelDatastore;
import Projeto.Enfermagem.projEnf.models.model.ResponsavelModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResponsavelService {
    private final ResponsavelDatastore datastore;

    public ResponsavelModel save(ResponsavelModel model){
        return datastore.salvar(model);
    }

    public List<ResponsavelModel> buscarTodos() {
        return datastore.buscarTodos();
    }

    public ResponsavelModel buscar(Long id) {
        return datastore.acharPorId(id);
    }
}
