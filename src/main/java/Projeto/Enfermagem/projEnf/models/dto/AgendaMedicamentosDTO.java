package Projeto.Enfermagem.projEnf.models.dto;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Medicamento;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgendaMedicamentosDTO {
    private int id;
    private Long medicamentoId;
    private Long pessoaId;
    private String info;
    @NotBlank(message = "Dosagem do medicamento não informado")
    private String dosagem;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotNull(message = "Data para inicio da medicação não informada")
    private LocalDate inicio;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate fim;
    @DateTimeFormat(pattern="HH:mm")
    @NotNull(message = "Informe o horario inicial para a medicação")
    private LocalTime horabase;
    @NotNull(message = "Informe a cada quanto tempo o idoso precisara da medicação")
    private Long horasmedicamento;
}
