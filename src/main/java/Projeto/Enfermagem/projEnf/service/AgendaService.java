package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Agenda;
import Projeto.Enfermagem.projEnf.repository.AgendaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

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

    @Transactional
    public List<Agenda> chamaAgenda() {
        List<Agenda> agenda = new ArrayList<>();

        agendaInterface.findAllByAgestatusOrderByAgedtAsc(true).forEach(agenda1 -> {
            if(agenda1.getAgedt().isAfter(LocalDate.now()) || agenda1.getAgedt().isEqual(LocalDate.now())){
                if(agenda.size() <= 5){
                    agenda.add(agenda1);
                }
            } else {
                agenda1.setAgestatus(false);
            }
        });

        return agenda;
    }

    public Agenda findbyid(int id) {
        return agendaInterface.findById(id).get();
    }
}
