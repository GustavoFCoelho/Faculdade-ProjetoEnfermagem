package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReligiaoDTO {
    private Long id;
    @NotBlank(message = "Informe o nome da religião!")
    private String nome;
    private String vertente;
    @NotBlank(message = "Descreva as caracteristicas da religião")
    private String descricao;
}
