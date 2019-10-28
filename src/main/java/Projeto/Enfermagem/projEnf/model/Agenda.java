package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
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
