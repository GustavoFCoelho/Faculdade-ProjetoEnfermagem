package Projeto.Enfermagem.projEnf.datastore.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Idoso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Pessoa pessoa;
    @ManyToOne
    private Religiao religiao;
    private String encaminhado;
    private String diabetico;
    private String chegada;
    private String estagioulcera;
    private String criseconvulsiva;
    private String altura;
    private String peso;
    private String etnia;
    private String hipertenso;
    private String estadocivil;
    private String graudependencia;
    private String usamedicamento;
    private String possuivicio;
    private String fezcirurgia;

}
