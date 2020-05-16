package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.impl.AgendaMedicamentoDatastore;
import Projeto.Enfermagem.projEnf.models.dto.AgendaMedicamentosPessoaDTO;
import Projeto.Enfermagem.projEnf.models.model.AgendaMedicamentosModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgemedService {
    private final AgendaMedicamentoDatastore datastore;

    public AgendaMedicamentosModel save(AgendaMedicamentosModel model){
        return datastore.save(model);
    }

    public List<AgendaMedicamentosPessoaDTO> buscarLista() {
        return datastore.buscarPendentes();
    }
}
