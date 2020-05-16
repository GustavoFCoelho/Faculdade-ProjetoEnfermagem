package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.impl.AgendaDatastore;
import Projeto.Enfermagem.projEnf.models.dto.AgendaPessoaDTO;
import Projeto.Enfermagem.projEnf.models.model.AgendaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AgendaService {

    private final AgendaDatastore datastore;

    public AgendaModel save(AgendaModel model) {
        return datastore.salvar(model);
    }

    public List<AgendaPessoaDTO> buscarPendentes(){
        return datastore.buscarPorData();
    }

    public AgendaModel buscar(Long id){
        return datastore.buscarPorId(id);
    }
}
