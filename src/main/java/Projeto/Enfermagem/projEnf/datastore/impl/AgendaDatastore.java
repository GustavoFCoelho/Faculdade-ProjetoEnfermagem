package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Agenda;
import Projeto.Enfermagem.projEnf.datastore.database.repository.AgendaRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.AgendaEntityConverter;
import Projeto.Enfermagem.projEnf.models.dto.AgendaPessoaDTO;
import Projeto.Enfermagem.projEnf.models.model.AgendaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class AgendaDatastore {
    private final AgendaRepository agendaRepository;
    private final AgendaEntityConverter converter;

    public AgendaModel salvar(AgendaModel model) {
        return converter.toModel(agendaRepository.save(converter.toEntity(model)));
    }

    public List<AgendaPessoaDTO> buscarPorData() {
        return agendaRepository.findAllByDataGreaterThanEqualOrderByDataAsc(LocalDate.now()).stream().map(this::montarAgendaPessoaDTO).collect(Collectors.toList());
    }

    private AgendaPessoaDTO montarAgendaPessoaDTO(Agenda agenda) {
        return AgendaPessoaDTO.builder()
                .compromisso(agenda.getDescricao())
                .data(agenda.getData())
                .hora(agenda.getHora())
                .id(agenda.getId())
                .numerorua(agenda.getNumerorua())
                .pessoaNome(agenda.getPessoa().getNome())
                .pessoaSobrenome(agenda.getPessoa().getSobrenome())
                .rua(agenda.getRua())
                .build();
    }

    public AgendaModel buscarPorId(Long id) {
        return converter.toModel(agendaRepository.findById(id).orElse(null));
    }
}
