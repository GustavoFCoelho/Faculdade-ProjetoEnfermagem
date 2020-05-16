package Projeto.Enfermagem.projEnf.models.converter.dto;

import Projeto.Enfermagem.projEnf.models.dto.ProntuarioDTO;
import Projeto.Enfermagem.projEnf.models.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProntuarioConverter {
    private final PessoaDTOConverter pessoaDTOConverter;
    private final AnotacoesDTOConverter anotacoesDTOConverter;
    private final ReligiaoDTOConverter religiaoDTOConverter;
    private final ResponsavelDTOConverter responsavelDTOConverter;
    private final IdosoDTOConverter idosoDTOConverter;
    public ProntuarioDTO criar(PessoaModel pessoaModel, List<AnotacoesModel> anotacoes, ReligiaoModel religiaoModel, ResponsavelModel responsavelModel, IdosoModel idosoModel) {
        return ProntuarioDTO.builder()
                .anotacoes(anotacoesDTOConverter.toDTOList(anotacoes))
                .idoso(idosoDTOConverter.toDTO(idosoModel))
                .pessoa(pessoaDTOConverter.toDTO(pessoaModel))
                .religiao(religiaoDTOConverter.toDTO(religiaoModel))
                .responsavel(responsavelDTOConverter.toDTO(responsavelModel))
                .build();
    }
}
