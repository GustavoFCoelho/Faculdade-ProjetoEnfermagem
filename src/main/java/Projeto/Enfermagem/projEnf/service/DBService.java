package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Religiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    private RelService service;
    public void dadosCriar() {
        Religiao religiao = new Religiao();
        religiao.setReldesc("Teste");
        religiao.setRelnome("Instalmica");
        religiao.setRelvertente("ASD");
        service.saverel(religiao);
    }
}
