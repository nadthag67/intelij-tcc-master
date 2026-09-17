package model.repository;

import model.entity.RegistroSintoma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroSintomaRepository extends JpaRepository<RegistroSintoma, Long> {
}
