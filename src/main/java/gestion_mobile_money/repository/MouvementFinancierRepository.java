package gestion_mobile_money.repository;

import gestion_mobile_money.model.MouvementFinancier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MouvementFinancierRepository extends JpaRepository<MouvementFinancier, Long> {
}