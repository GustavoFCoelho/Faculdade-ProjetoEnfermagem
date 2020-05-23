package Projeto.Enfermagem.projEnf.datastore.impl;

import Projeto.Enfermagem.projEnf.datastore.database.repository.ReligiaoRepository;
import Projeto.Enfermagem.projEnf.models.converter.entity.ReligiaoEntityConverter;
import Projeto.Enfermagem.projEnf.models.model.ReligiaoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ReligiaoDatastore {
    private final ReligiaoRepository repository;
    private final ReligiaoEntityConverter converter;

    public ReligiaoModel salvar(ReligiaoModel model){
        return converter.toModel(repository.save(converter.toEntity(model)));
    }

    public List<ReligiaoModel> buscarReligioes(){
        return converter.toModelList(repository.findAll());
    }

    public ReligiaoModel acharPorId(Long religiaoId) {
        return converter.toModel(repository.findById(religiaoId != null ? religiaoId : 0).orElse(null));
    }
}
