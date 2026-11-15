package gestion_mobile_money.repository;

import gestion_mobile_money.model.TransfertFonds;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransfertFondsRepository extends JpaRepository<TransfertFonds, Long> {
}