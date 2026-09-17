package model.repository;

import model.entity.RegistroHumor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroHumorRepository extends JpaRepository<RegistroHumor, Long> {
}