package Projeto.Enfermagem.projEnf.model;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
public class Responsaveis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resid;
    @CPF(message = "Digite um CPF válido!")
    private String rescpf;
    @OneToOne
    @NotNull(message = "É preciso linkar um paciente!")
    private Paciente respacid;
    @NotBlank(message = "Informe o nome do responsável")
    private String resnome;
    @NotBlank(message = "Informe o sobrenome do responsável")
    private String ressobrenome;
    @DateTimeFormat(pattern="yyyy-MM-dd") @NotNull(message = "Informe a data de nascimento do responsável")
    private LocalDate resdtnasc;
    private String resestado;
    private String rescidade;
    private String resendrua;
    private String resendnum;
    private String restelddd;
    @NotBlank(message = "Informe um contato para o responsável")
    private String restelnum1;

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
    public String getRestelddd() { return restelddd; }
    public void setRestelddd(String restelddd) { this.restelddd = restelddd; }
    public String getRestelnum1() { return restelnum1; }
    public void setRestelnum1(String restelnum1) { this.restelnum1 = restelnum1; }
}
