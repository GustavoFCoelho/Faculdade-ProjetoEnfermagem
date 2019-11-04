package Projeto.Enfermagem.projEnf.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ageid;
    @ManyToOne
    @NotNull(message = "É preciso informar o idoso!")
    private Paciente anopacid;
    @NotBlank(message = "É preciso informar qual é o compromisso")
    private String agecamp;
    @DateTimeFormat(pattern="yyyy-MM-dd") @NotNull(message = "Informe a data do compromisso!")
    private LocalDate agedt;
    @DateTimeFormat(pattern = "HH:mm") @NotNull(message = "Informe o horario do compromisso!")
    private LocalTime agehora;
    @NotBlank(message = "Informe o local do compromisso!")
    private String agerua;
    @NotBlank(message = "Informe o local do compromisso")
    private String ageruanum;
    private boolean agestatus = true;

    public Agenda(){
        anopacid = new Paciente();
    }

    public int getAgeid() { return ageid; }
    public void setAgeid(int ageid) { this.ageid = ageid; }
    public Paciente getAnopacid() { return anopacid; }
    public void setAnopacid(Paciente anopacid) { this.anopacid = anopacid; }
    public String getAgecamp() { return agecamp; }
    public void setAgecamp(String agecamp) { this.agecamp = agecamp; }
    public LocalDate getAgedt() { return agedt; }
    public void setAgedt(LocalDate agedt) { this.agedt = agedt; }
    public LocalTime getAgehora() { return agehora; }
    public void setAgehora(LocalTime agehora) { this.agehora = agehora; }
    public String getAgerua() { return agerua; }
    public void setAgerua(String agerua) { this.agerua = agerua; }
    public String getAgeruanum() { return ageruanum; }
    public void setAgeruanum(String ageruanum) { this.ageruanum = ageruanum; }
    public boolean isAgestatus() { return agestatus; }
    public void setAgestatus(boolean agestatus) { this.agestatus = agestatus; }
}
