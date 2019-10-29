package Projeto.Enfermagem.projEnf.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Anotacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int anoid;
    @ManyToOne
    @NotNull(message = "Selecione um idoso!")
    private Paciente anopacid;
    @NotBlank(message = "Informe a mensagem da anotação!")
    private String anocamp;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotNull(message = "Informe a data da anotação!")
    private LocalDate anodt;

    public int getAnoid() { return anoid; }
    public void setAnoid(int anoid) { this.anoid = anoid; }
    public Paciente getAnopacid() { return anopacid; }
    public void setAnopacid(Paciente anopacid) { this.anopacid = anopacid; }
    public String getAnocamp() { return anocamp; }
    public void setAnocamp(String anocamp) { this.anocamp = anocamp; }
    public LocalDate getAnodt() { return anodt; }
    public void setAnodt(LocalDate anodt) { this.anodt = anodt; }
}
