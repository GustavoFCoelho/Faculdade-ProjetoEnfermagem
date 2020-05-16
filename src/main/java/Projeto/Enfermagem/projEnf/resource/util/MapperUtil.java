package Projeto.Enfermagem.projEnf.resource.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MapperUtil {

    private ModelMapper mapper;

    MapperUtil(){
        mapper = new ModelMapper();
    }

    public ModelMapper use(){
        return mapper;
    }

}
