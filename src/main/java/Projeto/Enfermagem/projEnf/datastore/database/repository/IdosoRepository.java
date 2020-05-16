package Projeto.Enfermagem.projEnf.datastore.database.repository;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Idoso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdosoRepository extends JpaRepository<Idoso, Long> {
}
