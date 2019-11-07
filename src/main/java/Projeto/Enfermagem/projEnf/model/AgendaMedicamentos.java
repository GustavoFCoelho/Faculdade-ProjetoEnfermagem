package Projeto.Enfermagem.projEnf.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class AgendaMedicamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacmedid;
    @ManyToOne @NotNull(message = "Informe o idoso que deve tomar o remédio!")
    private Paciente pacmedpacid;
    @ManyToOne @NotNull(message = "Informe o remédio que o idoso deve tomar!")
    private Medicamento pacmedmedid;
    private String pacmedinfo;
    @NotBlank(message = "Informe a dosagem que o idoso deve tomar!")
    private String pacmeddosagem;
    @DateTimeFormat(pattern="yyyy-MM-dd") @NotNull(message = "Informe a data de inicio da medicação!")
    private LocalDate pacmedinicio;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate pacmedfim;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime pacmedhora;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime pacmedhora2;
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime pacmedhora3;
    private boolean pacmeddias;
    private String pacmeddom;
    private String pacmedseg;
    private String pacmedter;
    private String pacmedqua;
    private String pacmedqui;
    private String pacmedsex;
    private String pacmedsab;
    private boolean pacmedstatus = true;

    public AgendaMedicamentos(){
        pacmedpacid = new Paciente();
    }

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
    public String getPacmeddom() { return pacmeddom; }
    public void setPacmeddom(String pacmeddom) { this.pacmeddom = pacmeddom; }
    public String getPacmedseg() { return pacmedseg; }
    public void setPacmedseg(String pacmedseg) { this.pacmedseg = pacmedseg; }
    public String getPacmedter() { return pacmedter; }
    public void setPacmedter(String pacmedter) { this.pacmedter = pacmedter; }
    public String getPacmedqua() { return pacmedqua; }
    public void setPacmedqua(String pacmedqua) { this.pacmedqua = pacmedqua; }
    public String getPacmedqui() { return pacmedqui; }
    public void setPacmedqui(String pacmedqui) { this.pacmedqui = pacmedqui; }
    public String getPacmedsex() { return pacmedsex; }
    public void setPacmedsex(String pacmedsex) { this.pacmedsex = pacmedsex; }
    public String getPacmedsab() { return pacmedsab; }
    public void setPacmedsab(String pacmedsab) { this.pacmedsab = pacmedsab; }
    public boolean isPacmeddias() { return pacmeddias; }
    public void setPacmeddias(boolean pacmeddias) { this.pacmeddias = pacmeddias; }
    public boolean isPacmedstatus() { return pacmedstatus; }
    public void setPacmedstatus(boolean pacmedstatus) { this.pacmedstatus = pacmedstatus; }
}
