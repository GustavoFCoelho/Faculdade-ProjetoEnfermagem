package Projeto.Enfermagem.projEnf.template.converters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class DTOConverter<D, M> {

    public D toDTO(M model){
        if(model != null){
            return toDTOImpl(model);
        }
        return null;
    }

    public List<D> toDTOList(List<M> modelList){
        if(!modelList.isEmpty()){
            return modelList.stream().map(this::toDTO).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    protected abstract D toDTOImpl(M model);

    public M toModel(D dto){
        if(dto != null){
            return toModelImpl(dto);
        }
        return null;
    }

    protected abstract M toModelImpl(D dto);
}
