package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.repository.AnotacoesRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.AnotacoesEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.AnotacoesModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AnotacoesDatastore {
    private final AnotacoesRepository repository;
    private final AnotacoesEntityConverter converter;

    public AnotacoesModel salvar(AnotacoesModel model) {
        return converter.toModel(repository.save(converter.toEntity(model)));
    }

    public List<AnotacoesModel> acharTodosPorPessoaId(Long id) {
        return converter.toModelList(repository.findAllByIdosoId(id));
    }
}
