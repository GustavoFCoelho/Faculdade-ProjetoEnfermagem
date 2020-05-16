package Projeto.Enfermagem.projEnf.models.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MedicamentoModel {
    private int id;
    private String nome;
    private String infomarcao;
    private String dosagem;
}
