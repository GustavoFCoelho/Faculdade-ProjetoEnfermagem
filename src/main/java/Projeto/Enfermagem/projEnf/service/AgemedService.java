package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.AgendaMedicamentos;
import Projeto.Enfermagem.projEnf.repository.AgendaMedInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgemedService {
    @Autowired
    private AgendaMedInterface agendaMedInterface;
    @Autowired
    private PacService pacService;
    @Autowired
    private MedicamentoService medicamentoService;

    public void save(AgendaMedicamentos medicamentos){ agendaMedInterface.save(medicamentos); }
    public PacService getPacService() { return pacService; }
    public MedicamentoService getMedicamentoService() { return medicamentoService; }
}
