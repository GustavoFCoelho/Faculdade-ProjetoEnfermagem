package Projeto.Enfermagem.projEnf.models.model;

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
public class AgendaModel {
    private Long id;
    private Long pessoaId;
    private String descricao;
    private LocalDate data;
    private LocalTime hora;
    private String rua;
    private String numerorua;
    private boolean status;
}
