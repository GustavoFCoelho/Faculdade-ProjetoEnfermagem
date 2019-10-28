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
    @OneToMany(mappedBy = "pacmedmedid")
    private List<AgendaMedicamentos> agendaMedicamentos;

    public int getMedid() { return medid; }
    public void setMedid(int medid) { this.medid = medid; }
    public String getMednome() { return mednome; }
    public void setMednome(String mednome) { this.mednome = mednome; }
    public String getMedinfo() { return medinfo; }
    public void setMedinfo(String medinfo) { this.medinfo = medinfo; }
    public String getMeddosagem() { return meddosagem; }
    public void setMeddosagem(String meddosagem) { this.meddosagem = meddosagem; }
    public List<AgendaMedicamentos> getAgendaMedicamentos() { return agendaMedicamentos; }
    public void setAgendaMedicamentos(List<AgendaMedicamentos> agendaMedicamentos) { this.agendaMedicamentos = agendaMedicamentos; }
}
