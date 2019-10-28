package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Anotacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int anoid;
    @ManyToOne
    private Paciente anopacid;
    private String anocamp;
    private LocalDate anodt;
}
