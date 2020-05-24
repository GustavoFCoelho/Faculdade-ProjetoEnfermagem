package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.repository.PessoaRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.PessoaEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.PessoaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PessoaDatastore {

    private final PessoaRepository repository;
    private final PessoaEntityConverter converter;

    public PessoaModel salvar(PessoaModel model){
        return converter.toModel(repository.save(converter.toEntity(model)));
    }

    public PessoaModel acharPorId(Long id){
        return converter.toModel(repository.findById(id).orElse(null));
    }
}
