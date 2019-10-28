package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Religiao;
import Projeto.Enfermagem.projEnf.repository.RelInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelService {

    //====================================================================================
    // Vars
    //====================================================================================
    @Autowired
    private RelInterface reInterface;

    //====================================================================================
    // Salvar Religiao
    //====================================================================================
    public Religiao saverel(Religiao rel){ return reInterface.save(rel); }

    //====================================================================================
    // Achar todas as religiões
    //====================================================================================
    public List<Religiao> findAllRels(){
        return reInterface.findAll();
    }

}
