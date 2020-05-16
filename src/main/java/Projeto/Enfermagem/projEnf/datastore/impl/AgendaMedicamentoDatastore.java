package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.entity.AgendaMedicamentos;
import Projeto.Enfermagem.projEnf.datastore.database.repository.AgendaMedRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.AgendaMedicamentoEntityConverter;
import Projeto.Enfermagem.projEnf.models.dto.AgendaMedicamentosPessoaDTO;
import Projeto.Enfermagem.projEnf.models.model.AgendaMedicamentosModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AgendaMedicamentoDatastore {
    private final AgendaMedRepository repository;
    private final AgendaMedicamentoEntityConverter converter;

    public AgendaMedicamentosModel save(AgendaMedicamentosModel model){
        return converter.toModel(repository.save(converter.toEntity(model)));
    }

    public List<AgendaMedicamentosPessoaDTO> buscarPendentes() {
        return repository.acharPorStatusEEntreInicioEFim(LocalDate.now()).stream().map(this::montarAgenda).collect(Collectors.toList());
    }

    private AgendaMedicamentosPessoaDTO montarAgenda(AgendaMedicamentos agendaMedicamentos) {
        return AgendaMedicamentosPessoaDTO.builder()
                .diaFimMedicamento(agendaMedicamentos.getFim())
                .dosagem(agendaMedicamentos.getDosagem())
                .horaMedicamento(calcularHora(agendaMedicamentos.getHorabase(), agendaMedicamentos.getHorasmedicamento()))
                .id(agendaMedicamentos.getId())
                .medicamentoDosagem(agendaMedicamentos.getMedicamento().getDosagem())
                .medicamentoNome(agendaMedicamentos.getMedicamento().getNome())
                .pessoaNome(agendaMedicamentos.getPessoa().getNome())
                .pessoaSobrenome(agendaMedicamentos.getPessoa().getSobrenome())
                .build();
    }

    private LocalTime calcularHora(LocalTime horabase, Long horasmedicamento) {
        int horaAtual = LocalTime.now().getHour();
        int horab = horabase.getHour();

        if(horaAtual <= horab - horasmedicamento){
            return LocalTime.of(horab - horasmedicamento.intValue(), horabase.getMinute());
        } else if (horaAtual <= horab) {
            return horabase;
        } else if(horaAtual > horab){
            return LocalTime.of(horab + horasmedicamento.intValue(), horabase.getMinute());
        }
        return null;
    }
}
