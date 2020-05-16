package Projeto.Enfermagem.projEnf.datastore.database.repository;

import Projeto.Enfermagem.projEnf.datastore.database.entity.Anotacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnotacoesRepository extends JpaRepository<Anotacoes,Integer> {
}
