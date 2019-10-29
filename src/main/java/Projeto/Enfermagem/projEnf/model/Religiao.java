package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Religiao {

    //====================================================================================
    // Vars
    //====================================================================================
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int relid;
    @Column @NotBlank(message = "Informe o nome da religião!")
    private String relnome;
    @Column
    private String relvertente;
    @Column @NotBlank(message = "Descreva as caracteristicas da religião")
    private String reldesc;
    @OneToMany(mappedBy = "pacreligiao")
    private List<Paciente> paciente;

    public Religiao() {
    }

    public Religiao(int relid, @NotBlank(message = "Informe o nome da religião!") String relnome, String relvertente, @NotBlank(message = "Descreva as caracteristicas da religião") String reldesc) {
        this.relid = relid;
        this.relnome = relnome;
        this.relvertente = relvertente;
        this.reldesc = reldesc;
    }

    //====================================================================================
    // Getters e Setters
    //====================================================================================
    public int getRelid() { return relid; }
    public void setRelid(int relid) { this.relid = relid; }
    public String getRelnome() { return relnome; }
    public void setRelnome(String relnome) { this.relnome = relnome; }
    public String getRelvertente() { return relvertente; }
    public void setRelvertente(String relvertente) { this.relvertente = relvertente; }
    public String getReldesc() { return reldesc; }
    public void setReldesc(String reldesc) { this.reldesc = reldesc; }
}
