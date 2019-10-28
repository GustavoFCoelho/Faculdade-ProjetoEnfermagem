package Projeto.Enfermagem.projEnf.model;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacid;
    @NotBlank(message = "O campo não pode ser branco!")
    private String pacnome;
    @NotBlank(message = "O campo não pode ser branco!")
    private String pacsobrenome;
    private String pacrg;
    @CPF(message = "Informe um CPF valido!")
    private String paccpf;
    @DateTimeFormat(pattern="yyyy-MM-dd") @NotNull(message = "Informe a data de nascimento!")
    private LocalDate pacdtnasc;
    private String pacestcivil;
    @ManyToOne
    private Religiao pacreligiao;
    @DateTimeFormat(pattern="yyyy-MM-dd") @NotNull(message = "Informe a data de entrada!")
    private LocalDate pacdtentrada;
    private String pacsexo;
    private String pacetnia;
    @NotBlank(message = "Informe o peso do idoso!")
    private String pacpeso;
    @NotBlank(message = "Informe a altura do idoso!")
    private String pacalt;
    private Boolean pacstatus = true;
    @NotBlank(message = "Informe a origem do idoso!")
    private String pacenc;
    private String pacchegada;
    private String pacchegadadesc;
    private String pacdep;
    private String pacvicio;
    private String pacviciodesc;
    private String pachipertenso;
    private String pacdiabete;
    private String paccirurgia;
    private String paccirurgiadesc;
    private String paculcera;
    private String paculceraest;
    private String paccrisecon;
    private String pacmedicamento;
    private String pacmedicamentodesc;
    private String pacalergiamed;
    private String pacalergiadesc;

    @OneToMany(mappedBy = "pacmedpacid")
    private List<AgendaMedicamentos> agendamedicamentos;

    @OneToMany(mappedBy = "anopacid")
    private List<Anotacoes> anotacoes;

    @OneToOne(mappedBy = "respacid")
    private Responsaveis responsavel;

    @OneToMany(mappedBy = "anopacid")
    private List<Agenda> pacagenda;

    public int getPacid() { return pacid; }
    public void setPacid(int pacid) { this.pacid = pacid; }
    public String getPacnome() { return pacnome; }
    public void setPacnome(String pacnome) { this.pacnome = pacnome; }
    public String getPacsobrenome() { return pacsobrenome; }
    public void setPacsobrenome(String pacsobrenome) { this.pacsobrenome = pacsobrenome; }
    public String getPacrg() { return pacrg; }
    public void setPacrg(String pacrg) { this.pacrg = pacrg; }
    public String getPaccpf() { return paccpf; }
    public void setPaccpf(String paccpf) { this.paccpf = paccpf; }
    public LocalDate getPacdtnasc() { return pacdtnasc; }
    public void setPacdtnasc(LocalDate pacdtnasc) { this.pacdtnasc = pacdtnasc; }
    public String getPacestcivil() { return pacestcivil; }
    public void setPacestcivil(String pacestcivil) { this.pacestcivil = pacestcivil; }
    public Religiao getPacreligiao() { return pacreligiao; }
    public void setPacreligiao(Religiao pacreligiao) { this.pacreligiao = pacreligiao; }
    public LocalDate getPacdtentrada() { return pacdtentrada; }
    public void setPacdtentrada(LocalDate pacdtentrada) { this.pacdtentrada = pacdtentrada; }
    public String getPacsexo() { return pacsexo; }
    public void setPacsexo(String pacsexo) { this.pacsexo = pacsexo; }
    public String getPacetnia() { return pacetnia; }
    public void setPacetnia(String pacetnia) { this.pacetnia = pacetnia; }
    public String getPacpeso() { return pacpeso; }
    public void setPacpeso(String pacpeso) { this.pacpeso = pacpeso; }
    public String getPacalt() { return pacalt; }
    public void setPacalt(String pacalt) { this.pacalt = pacalt; }
    public Boolean getPacstatus() { return pacstatus; }
    public void setPacstatus(Boolean pacstatus) { this.pacstatus = pacstatus; }
    public String getPacenc() { return pacenc; }
    public void setPacenc(String pacenc) { this.pacenc = pacenc; }
    public String getPacchegada() { return pacchegada; }
    public void setPacchegada(String pacchegada) { this.pacchegada = pacchegada; }
    public String getPacchegadadesc() { return pacchegadadesc; }
    public void setPacchegadadesc(String pacchegadadesc) { this.pacchegadadesc = pacchegadadesc; }
    public String getPacdep() { return pacdep; }
    public void setPacdep(String pacdep) { this.pacdep = pacdep; }
    public String getPacvicio() { return pacvicio; }
    public void setPacvicio(String pacvicio) { this.pacvicio = pacvicio; }
    public String getPacviciodesc() { return pacviciodesc; }
    public void setPacviciodesc(String pacviciodesc) { this.pacviciodesc = pacviciodesc; }
    public String getPachipertenso() { return pachipertenso; }
    public void setPachipertenso(String pachipertenso) { this.pachipertenso = pachipertenso; }
    public String getPacdiabete() { return pacdiabete; }
    public void setPacdiabete(String pacdiabete) { this.pacdiabete = pacdiabete; }
    public String getPaccirurgia() { return paccirurgia; }
    public void setPaccirurgia(String paccirurgia) { this.paccirurgia = paccirurgia; }
    public String getPaccirurgiadesc() { return paccirurgiadesc; }
    public void setPaccirurgiadesc(String paccirurgiadesc) { this.paccirurgiadesc = paccirurgiadesc; }
    public String getPaculcera() { return paculcera; }
    public void setPaculcera(String paculcera) { this.paculcera = paculcera; }
    public String getPaculceraest() { return paculceraest; }
    public void setPaculceraest(String paculceraest) { this.paculceraest = paculceraest; }
    public String getPaccrisecon() { return paccrisecon; }
    public void setPaccrisecon(String paccrisecon) { this.paccrisecon = paccrisecon; }
    public String getPacmedicamento() { return pacmedicamento; }
    public void setPacmedicamento(String pacmedicamento) { this.pacmedicamento = pacmedicamento; }
    public String getPacmedicamentodesc() { return pacmedicamentodesc; }
    public void setPacmedicamentodesc(String pacmedicamentodesc) { this.pacmedicamentodesc = pacmedicamentodesc; }
    public String getPacalergiamed() { return pacalergiamed; }
    public void setPacalergiamed(String pacalergiamed) { this.pacalergiamed = pacalergiamed; }
    public String getPacalergiadesc() { return pacalergiadesc; }
    public void setPacalergiadesc(String pacalergiadesc) { this.pacalergiadesc = pacalergiadesc; }
    public List<AgendaMedicamentos> getAgendamedicamentos() { return agendamedicamentos; }
    public void setAgendamedicamentos(List<AgendaMedicamentos> agendamedicamentos) { this.agendamedicamentos = agendamedicamentos; }
    public List<Anotacoes> getAnotacoes() { return anotacoes; }
    public void setAnotacoes(List<Anotacoes> anotacoes) { this.anotacoes = anotacoes; }
    public Responsaveis getResponsavel() { return responsavel; }
    public void setResponsavel(Responsaveis responsavel) { this.responsavel = responsavel; }
    public List<Agenda> getPacagenda() { return pacagenda; }
    public void setPacagenda(List<Agenda> pacagenda) { this.pacagenda = pacagenda; }
}
