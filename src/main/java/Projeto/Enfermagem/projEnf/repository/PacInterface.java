package Projeto.Enfermagem.projEnf.repository;

import Projeto.Enfermagem.projEnf.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacInterface extends JpaRepository<Paciente, Integer> {
    List<Paciente> findAllByPacstatus(boolean b);
}
