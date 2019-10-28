package Projeto.Enfermagem.projEnf.repository;

import Projeto.Enfermagem.projEnf.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacInterface extends JpaRepository<Paciente, Integer> {
}
