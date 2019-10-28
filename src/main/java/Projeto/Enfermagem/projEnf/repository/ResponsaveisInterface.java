package Projeto.Enfermagem.projEnf.repository;

import Projeto.Enfermagem.projEnf.model.Responsaveis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsaveisInterface extends JpaRepository<Responsaveis,Integer> {
}
