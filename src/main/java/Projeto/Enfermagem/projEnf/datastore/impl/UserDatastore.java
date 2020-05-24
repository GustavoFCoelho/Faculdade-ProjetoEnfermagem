package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Idoso;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Pessoa;
import Projeto.Enfermagem.projEnf.datastore.database.entity.User;
import Projeto.Enfermagem.projEnf.datastore.database.repository.UserRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.PessoaEntityConverter;
import Projeto.Enfermagem.projEnf.models.converter.entity.UserEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.PessoaModel;
import Projeto.Enfermagem.projEnf.models.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class UserDatastore {

    private final UserRepository repository;
    private final UserEntityConverter converter;
    private final PessoaEntityConverter pessoaEntityConverter;

    public UserModel salvar(UserModel model){
        return converter.toModel(repository.save(converter.toEntity(model)));
    }

    public List<PessoaModel> acharTodosFuncionarioPessoa() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.addAll(repository.findAll().stream().map(User::getPessoa).collect(Collectors.toList()));
        return pessoaEntityConverter.toModelList(pessoas);
    }

    public UserModel findByPessoaID(Long id){
        return converter.toModel(repository.findByPessoaId(id).orElse(null));
    }
}
