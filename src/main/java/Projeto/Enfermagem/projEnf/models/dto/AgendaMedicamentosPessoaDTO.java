package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AgendaMedicamentosPessoaDTO {
    private Long id;
    private String pessoaNome;
    private String pessoaSobrenome;
    private String medicamentoNome;
    private String medicamentoDosagem;
    private String dosagem;
    private LocalTime horaMedicamento;
    private LocalDate diaFimMedicamento;
}
