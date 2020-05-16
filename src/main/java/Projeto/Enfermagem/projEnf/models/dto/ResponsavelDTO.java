package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponsavelDTO {
    private int id;
    private Long pessoaId;
    private String cpf;
    private String nome;
    private String sobrenome;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate datanascimento;
    private String estado;
    private String cidade;
    private String enderecorua;
    private String endereconumero;
    private String telefoneddd;
    private String telefonenumero;
}
