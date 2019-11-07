package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.AgendaMedicamentos;
import Projeto.Enfermagem.projEnf.repository.AgendaMedInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AgemedService {
    @Autowired
    private AgendaMedInterface agendaMedInterface;
    @Autowired
    private PacService pacService;
    @Autowired
    private MedicamentoService medicamentoService;

    public void save(AgendaMedicamentos medicamentos) {
        agendaMedInterface.save(medicamentos);
    }

    public PacService getPacService() {
        return pacService;
    }

    public MedicamentoService getMedicamentoService() {
        return medicamentoService;
    }

    public List<AgendaMedicamentos> returnMed() {
        List<AgendaMedicamentos> list = new ArrayList<>();
        agendaMedInterface.findAllByPacmedstatus(true).forEach(medicamentos -> {
            if (medicamentos.getPacmedfim().isAfter(LocalDate.now())) {
                if (medicamentos.getPacmedhora() != null) {
                    if(medicamentos.getPacmedhora().isBefore(LocalTime.now())){
                        medicamentos.setPacmedhora(null);
                        if(medicamentos.getPacmedhora2() != null){
                            if(medicamentos.getPacmedhora2().isBefore(LocalTime.now())){
                                medicamentos.setPacmedhora2(null);
                                if(medicamentos.getPacmedhora3().isBefore(LocalTime.now())){
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                if (medicamentos.isPacmeddias()) {
                    String dayofweek = LocalDate.now().getDayOfWeek().toString();
                    if (medicamentos.getPacmeddom().equals(dayofweek)) {
                        list.add(medicamentos);
                    } else if (medicamentos.getPacmedseg().equals(dayofweek)) {
                        list.add(medicamentos);
                    } else if (medicamentos.getPacmedter().equals(dayofweek)) {
                        list.add(medicamentos);
                    } else if (medicamentos.getPacmedqua().equals(dayofweek)) {
                        list.add(medicamentos);
                    } else if (medicamentos.getPacmedqui().equals(dayofweek)) {
                        list.add(medicamentos);
                    } else if (medicamentos.getPacmedsex().equals(dayofweek)) {
                        list.add(medicamentos);
                    } else if (medicamentos.getPacmedsab().equals(dayofweek)) {
                        list.add(medicamentos);
                    }
                } else {
                    list.add(medicamentos);
                }
            } else {
                medicamentos.setPacmedstatus(false);
            }
        });
        return list;
    }

    public AgendaMedicamentos findbyid(int id) {
        return agendaMedInterface.findById(id).get();
    }
}
