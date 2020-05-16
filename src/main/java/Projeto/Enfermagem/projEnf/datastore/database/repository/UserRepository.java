package Projeto.Enfermagem.projEnf.datastore.database.repository;

import Projeto.Enfermagem.projEnf.datastore.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
