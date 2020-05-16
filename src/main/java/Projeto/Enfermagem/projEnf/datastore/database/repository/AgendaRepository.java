package Projeto.Enfermagem.projEnf.datastore.database.repository;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda,Long> {
    List<Agenda> findAllByStatusOrderByDataAsc(boolean b);
    List<Agenda> findAllByDataGreaterThanEqualOrderByDataAsc(LocalDate date);
}
