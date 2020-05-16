package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgendaPessoaDTO {
    private Long id;
    private String compromisso;
    private String pessoaNome;
    private String pessoaSobrenome;
    private String rua;
    private String numerorua;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate data;
    @DateTimeFormat(pattern="HH:mm")
    private LocalTime hora;


}
