package Projeto.Enfermagem.projEnf.repository;

import Projeto.Enfermagem.projEnf.model.AgendaMedicamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendaMedInterface extends JpaRepository<AgendaMedicamentos,Integer> {
    List<AgendaMedicamentos> findAllByPacmedstatus(boolean b);
}
