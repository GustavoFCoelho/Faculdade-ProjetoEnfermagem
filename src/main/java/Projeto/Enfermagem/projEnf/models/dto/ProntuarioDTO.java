package Projeto.Enfermagem.projEnf.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProntuarioDTO {
    private PessoaDTO pessoa;
    private IdosoDTO idoso;
    private List<AnotacoesDTO> anotacoes;
    private ReligiaoDTO religiao;
    private ResponsavelDTO responsavel;
}
