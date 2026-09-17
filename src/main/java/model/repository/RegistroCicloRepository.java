package model.repository;

import model.entity.RegistroCiclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository avisa ao Spring que esta interface acessa o banco de dados.
@Repository
public interface RegistroCicloRepository extends JpaRepository<RegistroCiclo, Long> {
}