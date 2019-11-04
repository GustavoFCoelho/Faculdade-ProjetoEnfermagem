package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Anotacoes;
import Projeto.Enfermagem.projEnf.model.Paciente;
import Projeto.Enfermagem.projEnf.model.Religiao;
import Projeto.Enfermagem.projEnf.model.Responsaveis;
import Projeto.Enfermagem.projEnf.repository.PacInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PacService {
    @Autowired
    private PacInterface pacInterface;
    @Autowired
    private RelService reService;
    @Autowired
    private ResponsavelService responsavelService;
    @Autowired
    private AnotacoesService anotacoesService;

    public void savePac(Paciente pac) {
        pacInterface.save(pac);
    }

    public List<Religiao> callRegis() {
        return reService.findAllRels();
    }

    public List<Paciente> callPacs() {
        return pacInterface.findAllByPacstatus(true);
    }

    public Paciente findByID(int pacid) {
        if (pacInterface.existsById(pacid))
            return pacInterface.findById(pacid).get();
        else throw new IllegalArgumentException("Paciente não foi encontrado no banco de dados!");
    }
}
