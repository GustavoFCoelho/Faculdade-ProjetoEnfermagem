package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicamentoDTO {
    private int id;
    @NotBlank(message = "Informe o nome do medicamento")
    private String nome;
    @NotBlank(message = "Informe os efeitos do medicamento")
    private String informacao;
    private String dosagem;
}
