package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private Long pessoaId;
    @NotBlank(message = "Informe o login para o usuário")
    private String login;
    @NotBlank(message = "Informe a senha para o usuário")
    private String senha;
}
