package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
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
    private boolean pacmeddias;
    private boolean pacmeddom;
    private boolean pacmedseg;
    private boolean pacmedter;
    private boolean pacmedqua;
    private boolean pacmedqui;
    private boolean pacmedsex;
    private boolean pacmedsab;

    public int getPacmedid() { return pacmedid; }
    public void setPacmedid(int pacmedid) { this.pacmedid = pacmedid; }
    public Paciente getPacmedpacid() { return pacmedpacid; }
    public void setPacmedpacid(Paciente pacmedpacid) { this.pacmedpacid = pacmedpacid; }
    public Medicamento getPacmedmedid() { return pacmedmedid; }
    public void setPacmedmedid(Medicamento pacmedmedid) { this.pacmedmedid = pacmedmedid; }
    public String getPacmedinfo() { return pacmedinfo; }
    public void setPacmedinfo(String pacmedinfo) { this.pacmedinfo = pacmedinfo; }
    public String getPacmeddosagem() { return pacmeddosagem; }
    public void setPacmeddosagem(String pacmeddosagem) { this.pacmeddosagem = pacmeddosagem; }
    public LocalDate getPacmedinicio() { return pacmedinicio; }
    public void setPacmedinicio(LocalDate pacmedinicio) { this.pacmedinicio = pacmedinicio; }
    public LocalDate getPacmedfim() { return pacmedfim; }
    public void setPacmedfim(LocalDate pacmedfim) { this.pacmedfim = pacmedfim; }
    public LocalTime getPacmedhora() { return pacmedhora; }
    public void setPacmedhora(LocalTime pacmedhora) { this.pacmedhora = pacmedhora; }
    public LocalTime getPacmedhora2() { return pacmedhora2; }
    public void setPacmedhora2(LocalTime pacmedhora2) { this.pacmedhora2 = pacmedhora2; }
    public LocalTime getPacmedhora3() { return pacmedhora3; }
    public void setPacmedhora3(LocalTime pacmedhora3) { this.pacmedhora3 = pacmedhora3; }
    public boolean isPacmeddom() { return pacmeddom; }
    public void setPacmeddom(boolean pacmeddom) { this.pacmeddom = pacmeddom; }
    public boolean isPacmedseg() { return pacmedseg; }
    public void setPacmedseg(boolean pacmedseg) { this.pacmedseg = pacmedseg; }
    public boolean isPacmedter() { return pacmedter; }
    public void setPacmedter(boolean pacmedter) { this.pacmedter = pacmedter; }
    public boolean isPacmedqua() { return pacmedqua; }
    public void setPacmedqua(boolean pacmedqua) { this.pacmedqua = pacmedqua; }
    public boolean isPacmedqui() { return pacmedqui; }
    public void setPacmedqui(boolean pacmedqui) { this.pacmedqui = pacmedqui; }
    public boolean isPacmedsex() { return pacmedsex; }
    public void setPacmedsex(boolean pacmedsex) { this.pacmedsex = pacmedsex; }
    public boolean isPacmedsab() { return pacmedsab; }
    public void setPacmedsab(boolean pacmedsab) { this.pacmedsab = pacmedsab; }
    public boolean isPacmeddias() { return pacmeddias; }
    public void setPacmeddias(boolean pacmeddias) { this.pacmeddias = pacmeddias; }
}
