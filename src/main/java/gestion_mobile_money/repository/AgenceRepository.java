package gestion_mobile_money.repository;

import gestion_mobile_money.model.Agence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}