package Projeto.Enfermagem.projEnf.datastore.database.repository;

import Projeto.Enfermagem.projEnf.datastore.database.entity.AgendaMedicamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AgendaMedRepository extends JpaRepository<AgendaMedicamentos,Long> {
    @Query("select a from AgendaMedicamentos a where a.inicio <= ?1 and a.fim >= ?1")
    List<AgendaMedicamentos> acharPorStatusEEntreInicioEFim(LocalDate data);
}
