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

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PessoaDTO {
    private Long id;
    @NotBlank(message = "Nome da pessoa não informado")
    private String nome;
    @NotBlank(message = "Sobrenome da pessoa não informado")
    private String sobrenome;
    @NotBlank(message = "CPF não informado")
    @CPF(message = "CPF Inválido")
    private String cpf;
    @NotBlank(message = "RG não informado")
    private String rg;
    private String sexo;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate datanascimento;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate dataentrada;
    @NotNull(message = "Selecione o tipo da pessoa")
    private String tipopessoa;
}
