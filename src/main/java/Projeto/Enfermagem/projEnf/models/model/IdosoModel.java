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
    private String enchaminhado;
    private String diabetico;
    private String chegada;
    private String estagioulcera;
    private String criseconvulsiva;
    private Long religiaoId;
}
