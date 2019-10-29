package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Paciente;
import Projeto.Enfermagem.projEnf.model.Religiao;
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

    public void savePac(Paciente pac) {
        pacInterface.save(pac);
    }

    public List<Religiao> callRegis() {
        return reService.findAllRels();
    }

    public List<Paciente> callPacs() {
        return pacInterface.findAll();
    }

    public Paciente findByID(int pacid) {
        if (pacInterface.existsById(pacid))
            return pacInterface.findById(pacid).get();
        else throw new IllegalArgumentException("Paciente não foi encontrado no banco de dados!");
    }

    public void insertPac() {
        Religiao religiao = new Religiao(1, "Cristão", "Católica", "TESTE");
        reService.saverel(religiao);
        pacInterface.save(new Paciente(
                1,
                "Gustavo",
                "Coelho",
                "141088203",
                "12247635997",
                LocalDate.of(2000, 12, 9),
                "Solteiro",
                LocalDate.of(2019, 2, 12),
                "Masculino",
                "Pardo",
                "100.00",
                "1.80",
                Boolean.TRUE,
                "Familia",
                "Consciente",
                "Teste",
                "SemAuxilio",
                "Sim",
                "Teste",
                "Nao",
                "Nao",
                "Nao",
                "Teste",
                "Sim",
                "III",
                "Sim",
                "Nao",
                "Teste",
                "Sim",
                "Teste",
                religiao));
    }
}
