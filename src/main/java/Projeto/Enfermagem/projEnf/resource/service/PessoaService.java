package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.database.repository.PessoaRepository;
import Projeto.Enfermagem.projEnf.datastore.database.repository.UserRepository;
import Projeto.Enfermagem.projEnf.datastore.impl.AnotacoesDatastore;
import Projeto.Enfermagem.projEnf.datastore.impl.IdosoDatastore;
import Projeto.Enfermagem.projEnf.datastore.impl.ReligiaoDatastore;
import Projeto.Enfermagem.projEnf.models.converter.entity.PessoaEntityConverter;
import Projeto.Enfermagem.projEnf.models.converter.entity.UserEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final UserRepository userRepository;
    private final IdosoDatastore idosoDatastore;
    private final ReligiaoDatastore religiaoDatastore;
    private final AnotacoesDatastore anotacoesDatastore;

    private final PessoaEntityConverter converter;
    private final UserEntityConverter userEntityConverter;


    public PessoaModel savePessoa(PessoaModel pac) {
        return converter.toModel(pessoaRepository.save(converter.toEntity(pac)));
    }

    public IdosoModel saveIdoso(IdosoModel idoso) {
        return idosoDatastore.salvarIdoso(idoso);
    }

    public UserModel saveUser(UserModel model) {
        return userEntityConverter.toModel(userRepository.save(userEntityConverter.toEntity(model)));
    }

    public List<ReligiaoModel> chamarReligoes() {
        return religiaoDatastore.buscarReligioes();
    }

    public ReligiaoModel saveReligiao(ReligiaoModel model) {
        return religiaoDatastore.salvar(model);
    }

    public AnotacoesModel saveAnotacoes(AnotacoesModel model) {
        return anotacoesDatastore.salvar(model);
    }

    public List<PessoaModel> getAllIdososPessoas(){
        return idosoDatastore.buscarTodosIdososPessoas();
    }

}
