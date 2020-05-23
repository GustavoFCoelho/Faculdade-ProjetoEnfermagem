package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AgendaDTO {
    private Long id;
    private Long pessoaId;
    @NotBlank(message = "Compromisso não informado")
    private String descricao;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotNull(message = "Data do compromisso não Informado")
    private LocalDate data;
    @DateTimeFormat(pattern="HH:mm")
    @NotNull(message = "Horario do compromisso não informado")
    private LocalTime hora;
    @NotBlank(message = "Rua não informado")
    private String rua;
    private String numerorua;
    private boolean status = true;
}
