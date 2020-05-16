package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AgendaDTO {
    private Long id;
    private Long pessoaId;
    private String descricao;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate data;
    @DateTimeFormat(pattern="HH:mm")
    private LocalTime hora;
    private String rua;
    private String numerorua;
    private boolean status = true;
}
