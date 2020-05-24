package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.repository.ResponsavelRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.ResponsavelEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.ResponsavelModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ResponsavelDatastore {
    private final ResponsavelRepository repository;
    private final ResponsavelEntityConverter converter;

    public ResponsavelModel salvar(ResponsavelModel responsavelModel){
        return converter.toModel(repository.save(converter.toEntity(responsavelModel)));
    }

    public ResponsavelModel acharPorPessoaId(Long id) {
        return converter.toModel(repository.findByPessoaId(id));
    }

    public List<ResponsavelModel> buscarTodos() {
        return converter.toModelList(repository.findAll());
    }

    public ResponsavelModel acharPorId(Long id) {
        return converter.toModel(repository.findById(id.intValue()).orElse(null));
    }
}
