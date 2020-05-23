package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AnotacoesDTO {
    private int id;
    @NotNull(message = "Idoso não selecionado!")
    private Long idosoId;
    @NotBlank(message = "Descricão não informada!")
    private String descricao;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotNull(message = "Informe a data da anotação")
    private LocalDate data;
}
