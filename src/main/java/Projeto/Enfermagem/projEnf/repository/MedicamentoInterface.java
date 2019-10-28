package Projeto.Enfermagem.projEnf.repository;

import Projeto.Enfermagem.projEnf.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoInterface extends JpaRepository<Medicamento,Integer> {
}
