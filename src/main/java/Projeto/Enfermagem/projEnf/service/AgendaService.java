package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Agenda;
import Projeto.Enfermagem.projEnf.repository.AgendaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {
    @Autowired
    private AgendaInterface agendaInterface;
    @Autowired
    private PacService pacService;

    public void save(Agenda agenda){ agendaInterface.save(agenda); }

    public PacService getPacService() {
        return pacService;
    }
}
