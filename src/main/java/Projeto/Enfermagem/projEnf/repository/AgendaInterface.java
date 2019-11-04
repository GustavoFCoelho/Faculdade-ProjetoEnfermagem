package Projeto.Enfermagem.projEnf.repository;

import Projeto.Enfermagem.projEnf.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendaInterface extends JpaRepository<Agenda,Integer> {
    List<Agenda> findAllByAgestatusOrderByAgedtAsc(boolean b);
}
