package Projeto.Enfermagem.projEnf.repository;

import Projeto.Enfermagem.projEnf.model.Anotacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnotacoesRepository extends JpaRepository<Anotacoes,Integer> {
}
