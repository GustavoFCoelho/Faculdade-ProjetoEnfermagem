package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Anotacoes;
import Projeto.Enfermagem.projEnf.repository.AnotacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnotacoesService {
    @Autowired
    private AnotacoesRepository anotacoesRepository;
    @Autowired
    private PacService pacService;

    public void save(Anotacoes anotacoes){ anotacoesRepository.save(anotacoes); }

    public PacService getPacService() { return pacService; }
}
