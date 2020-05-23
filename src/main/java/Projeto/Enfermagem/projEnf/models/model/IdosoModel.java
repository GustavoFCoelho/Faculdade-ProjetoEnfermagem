package Projeto.Enfermagem.projEnf.models.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IdosoModel {
    private Long id;
    private Long pessoaId;
    private String encaminhado;
    private String diabetico;
    private String chegada;
    private String estagioulcera;
    private String criseconvulsiva;
    private Long religiaoId;
    private String altura;
    private String peso;
    private String etnia;
    private String hipertenso;
    private String estadocivil;
    private String graudependencia;
    private String usamedicamento;
    private String possuivicio;
    private String fezcirurgia;
    private String viciodesc;
    private String medicamentodesc;
    private String cirurgiadesc;

}
