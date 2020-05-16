package Projeto.Enfermagem.projEnf.template.converters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class EntityConverter<E, M> {
    public E toEntity(M model){
        if(model != null){
            return toEntityImpl(model);
        }
        return null;
    }

    protected abstract E toEntityImpl(M model);

    public M toModel(E entity){
        if(entity != null){
            return toModelImpl(entity);
        }
        return null;
    }

    public List<M> toModelList(List<E> listEntity){
        if(!listEntity.isEmpty()){
            return listEntity.stream().map(this::toModel).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }
    protected abstract M toModelImpl(E entity);
}
