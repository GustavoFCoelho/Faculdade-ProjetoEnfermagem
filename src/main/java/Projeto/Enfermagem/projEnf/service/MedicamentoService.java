package Projeto.Enfermagem.projEnf.service;

import Projeto.Enfermagem.projEnf.model.Medicamento;
import Projeto.Enfermagem.projEnf.repository.MedicamentoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {
    @Autowired
    private MedicamentoInterface medInterface;

    public void saveMedicamento(Medicamento med){ medInterface.save(med); }
    public List<Medicamento> callMeds(){return medInterface.findAll();}
}
