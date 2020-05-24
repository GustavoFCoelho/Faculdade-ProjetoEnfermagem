package Projeto.Enfermagem.projEnf.resource.service;

import Projeto.Enfermagem.projEnf.datastore.impl.*;
import Projeto.Enfermagem.projEnf.models.converter.dto.ProntuarioConverter;
import Projeto.Enfermagem.projEnf.models.dto.ProntuarioDTO;
import Projeto.Enfermagem.projEnf.models.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaDatastore pessoaDatastore;
    private final UserDatastore userDatastore;
    private final IdosoDatastore idosoDatastore;
    private final ReligiaoDatastore religiaoDatastore;
    private final AnotacoesDatastore anotacoesDatastore;
    private final ResponsavelDatastore responsavelDatastore;

    private final ProntuarioConverter prontuarioConverter;

    private PasswordEncoder encoder;

    public PessoaModel savePessoa(PessoaModel pac) {
        return pessoaDatastore.salvar(pac);
    }

    public IdosoModel saveIdoso(IdosoModel idoso) {
        return idosoDatastore.salvarIdoso(idoso);
    }

    public UserModel saveUser(UserModel model) {
        model.setSenha(encoder.encode(model.getSenha()));
        return userDatastore.salvar(model);
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

    public ProntuarioDTO getProntuario(Long id){
        PessoaModel pessoaModel = pessoaDatastore.acharPorId(id);
        List<AnotacoesModel> anotacoes = anotacoesDatastore.acharTodosPorPessoaId(id);
        ResponsavelModel responsavelModel = responsavelDatastore.acharPorPessoaId(id);
        IdosoModel idosoModel = idosoDatastore.acharPorPessoaId(id);
        ReligiaoModel religiaoModel = religiaoDatastore.acharPorId(idosoModel.getReligiaoId());
        return prontuarioConverter.criar(pessoaModel, anotacoes, religiaoModel, responsavelModel, idosoModel);
    }

    public PessoaModel buscaPessoa(Long id) {
        return pessoaDatastore.acharPorId(id);
    }

    public List<PessoaModel> getAllFuncionarioPessoa() {
        return userDatastore.acharTodosFuncionarioPessoa();
    }

    public UserModel buscarUser(Long id) {
        return userDatastore.findByPessoaID(id);
    }

    public IdosoModel buscaIdoso(Long id) {
        return idosoDatastore.acharPorPessoaId(id);
    }

    public ReligiaoModel buscaReligiao(Long id) {
        return religiaoDatastore.acharPorId(id);
    }
}
