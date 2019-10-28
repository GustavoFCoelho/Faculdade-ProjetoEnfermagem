package Projeto.Enfermagem.projEnf.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Responsaveis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resid;
    private String rescpf;
    @OneToOne
    private Paciente respacid;
    private String resnome;
    private String ressobrenome;
    private LocalDate resdtnasc;
    private String resestado;
    private String rescidade;
    private String resendrua;
    private String resendnum;
    private String restelDDD;
    private String restelNum1;

    public int getResid() { return resid; }
    public void setResid(int resid) { this.resid = resid; }
    public String getRescpf() { return rescpf; }
    public void setRescpf(String rescpf) { this.rescpf = rescpf; }
    public Paciente getRespacid() { return respacid; }
    public void setRespacid(Paciente respacid) { this.respacid = respacid; }
    public String getResnome() { return resnome; }
    public void setResnome(String resnome) { this.resnome = resnome; }
    public String getRessobrenome() { return ressobrenome; }
    public void setRessobrenome(String ressobrenome) { this.ressobrenome = ressobrenome; }
    public LocalDate getResdtnasc() { return resdtnasc; }
    public void setResdtnasc(LocalDate resdtnasc) { this.resdtnasc = resdtnasc; }
    public String getResestado() { return resestado; }
    public void setResestado(String resestado) { this.resestado = resestado; }
    public String getRescidade() { return rescidade; }
    public void setRescidade(String rescidade) { this.rescidade = rescidade; }
    public String getResendrua() { return resendrua; }
    public void setResendrua(String resendrua) { this.resendrua = resendrua; }
    public String getResendnum() { return resendnum; }
    public void setResendnum(String resendnum) { this.resendnum = resendnum; }
    public String getRestelDDD() { return restelDDD; }
    public void setRestelDDD(String restelDDD) { this.restelDDD = restelDDD; }
    public String getRestelNum1() { return restelNum1; }
    public void setRestelNum1(String restelNum1) { this.restelNum1 = restelNum1; }
}
