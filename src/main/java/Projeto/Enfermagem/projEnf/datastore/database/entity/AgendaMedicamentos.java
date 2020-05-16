package Projeto.Enfermagem.projEnf.datastore.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AgendaMedicamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Medicamento medicamento;
    @ManyToOne
    private Pessoa pessoa;
    private String info;
    private String dosagem;
    private LocalDate inicio;
    private LocalDate fim;
    private LocalTime horabase;
    private Long horasmedicamento;
    private boolean status = true;

}
