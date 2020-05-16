package Projeto.Enfermagem.projEnf.models.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgendaMedicamentosModel {
    private int id;
    private Long medicamentoId;
    private Long pessoaId;
    private String info;
    private String dosagem;
    private LocalDate inicio;
    private LocalDate fim;
    private LocalTime horabase;
    private Long horasmedicamento;
}
