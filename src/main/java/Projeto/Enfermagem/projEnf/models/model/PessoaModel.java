package Projeto.Enfermagem.projEnf.models.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PessoaModel {
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private String sexo;
    private LocalDate datanascimento;
    private LocalDate dataentrada;
    private String tipopessoa;
}
