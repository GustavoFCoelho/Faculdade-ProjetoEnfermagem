package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Paciente;
import Projeto.Enfermagem.projEnf.model.Religiao;
import Projeto.Enfermagem.projEnf.repository.PacInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacService {
    @Autowired
    private PacInterface pacInterface;
    @Autowired
    private RelService reService;

    public void savePac(Paciente pac){
        pacInterface.save(pac);
    }
    public List<Religiao> callRegis(){ return reService.findAllRels(); }
    public List<Paciente> callPacs(){ return pacInterface.findAll(); }
}
