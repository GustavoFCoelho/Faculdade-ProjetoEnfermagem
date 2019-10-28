package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ageid;
    @ManyToOne
    private Paciente anopacid;
    private String agecamp;
    private LocalDate agedt;
    private LocalTime agehora;
    private String agerua;
    private String ageruanum;
    private boolean agestatus;
}
