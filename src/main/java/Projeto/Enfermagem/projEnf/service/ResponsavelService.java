package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Responsaveis;
import Projeto.Enfermagem.projEnf.repository.ResponsaveisInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponsavelService {
    @Autowired
    private ResponsaveisInterface responsavelService;
    @Autowired
    private PacService pacService;
    public void save(Responsaveis resp){responsavelService.save(resp);}

    public PacService getPacService() {
        return pacService;
    }
}
