package Projeto.Enfermagem.projEnf.models.dto;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Medicamento;
import Projeto.Enfermagem.projEnf.datastore.database.entity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
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
    private String dosagem;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate inicio;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate fim;
    @DateTimeFormat(pattern="HH:mm")
    private LocalTime horabase;
    private Long horasmedicamento;
}
