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
public class ResponsavelModel {
    private int id;
    private Long pessoaId;
    private String cpf;
    private String nome;
    private String sobrenome;
    private LocalDate datanascimento;
    private String estado;
    private String cidade;
    private String enderecorua;
    private String endereconumero;
    private String telefoneddd;
    private String telefonenumero;
}
