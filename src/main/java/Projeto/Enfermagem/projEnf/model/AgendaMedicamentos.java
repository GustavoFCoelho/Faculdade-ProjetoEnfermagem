package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaMedicamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacmedid;
    @ManyToOne
    private Paciente pacmedpacid;
    @ManyToOne
    private Medicamento pacmedmedid;
    private String pacmedinfo;
    private String pacmeddosagem;
    private LocalDate pacmedinicio;
    private LocalDate pacmedfim;
    private LocalTime pacmedhora;
    private LocalTime pacmedhora2;
    private LocalTime pacmedhora3;
    private boolean pacmeddom;
    private boolean pacmedseg;
    private boolean pacmedter;
    private boolean pacmedqua;
    private boolean pacmedqui;
    private boolean pacmedsex;
    private boolean pacmedsab;
}
