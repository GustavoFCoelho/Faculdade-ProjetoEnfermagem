package Projeto.Enfermagem.projEnf.datastore.database.repository;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Religiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReligiaoRepository extends JpaRepository<Religiao, Long> {
}
