package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class IdosoDTO {
    private Long id;
    private Long pessoaId;
    @NotBlank(message = "Infome como o idoso foi encaminhado")
    private String encaminhado;
    private String diabetico;
    @NotBlank(message = "Infome como foi a chegada do idoso")
    private String chegada;
    private String estagioulcera;
    private String criseconvulsiva;
    private Long religiaoId;
    private Double altura;
    private String etnia;
    private Double peso;
    private String hipertenso;
    private String estadocivil;
    private String graudependencia;
    private String usamedicamento;
    private String possuivicio;
    private String fezcirurgia;
}
