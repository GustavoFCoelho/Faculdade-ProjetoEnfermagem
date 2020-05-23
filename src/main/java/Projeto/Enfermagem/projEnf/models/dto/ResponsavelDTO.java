package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponsavelDTO {
    private int id;
    private Long pessoaId;
    @CPF(message = "CPF inválido")
    private String cpf;
    @NotBlank(message = "Nome não informado")
    private String nome;
    @NotBlank(message = "Sobrenome não informado")
    private String sobrenome;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotNull(message = "Informe a data de nascimento")
    private LocalDate datanascimento;
    private String estado;
    private String cidade;
    private String enderecorua;
    private String endereconumero;
    private String telefoneddd;
    private String telefonenumero;
}
