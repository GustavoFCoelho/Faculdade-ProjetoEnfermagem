package Projeto.Enfermagem.projEnf.models.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnotacoesModel {
    private int id;
    private Long idosoId;
    @NotBlank(message = "Descrição não informada!")
    private String descricao;
    private LocalDate data;
}
