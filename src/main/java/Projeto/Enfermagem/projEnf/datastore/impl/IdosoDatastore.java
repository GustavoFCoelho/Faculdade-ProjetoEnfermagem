package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Idoso;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Pessoa;
import Projeto.Enfermagem.projEnf.datastore.database.repository.IdosoRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.IdosoEntityConverter;
import Projeto.Enfermagem.projEnf.models.converter.entity.PessoaEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.IdosoModel;
import Projeto.Enfermagem.projEnf.models.model.PessoaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class IdosoDatastore {
    private final IdosoRepository repository;
    private final IdosoEntityConverter converter;
    private final PessoaEntityConverter pessoaEntityConverter;

    public IdosoModel salvarIdoso(IdosoModel model){
        return converter.toModel(repository.save(converter.toEntity(model)));
    }

    public List<PessoaModel> buscarTodosIdososPessoas(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.addAll(repository.findAll().stream().map(Idoso::getPessoa).collect(Collectors.toList()));
        return pessoaEntityConverter.toModelList(pessoas);
    }
}
