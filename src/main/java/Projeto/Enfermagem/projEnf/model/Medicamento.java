package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medid;
    private String mednome;
    private String medinfo;
    private String meddosagem;
    @OneToMany(mappedBy = "pacMedmedid")
    private List<AgendaMedicamentos> agendaMedicamentos;

}
