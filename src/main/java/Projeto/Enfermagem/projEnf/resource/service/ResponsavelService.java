package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.impl.ResponsavelDatastore;
import Projeto.Enfermagem.projEnf.models.model.ResponsavelModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResponsavelService {
    private final ResponsavelDatastore datastore;

    public ResponsavelModel save(ResponsavelModel model){
        return datastore.salvar(model);
    }
}
