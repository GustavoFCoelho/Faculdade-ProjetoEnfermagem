package Projeto.Enfermagem.projEnf.datastore.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Pessoa pessoa;
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
