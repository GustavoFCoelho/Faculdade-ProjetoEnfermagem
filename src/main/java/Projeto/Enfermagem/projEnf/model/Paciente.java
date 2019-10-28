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


}
