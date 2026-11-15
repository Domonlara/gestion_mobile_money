package gestion_mobile_money.repository;

import gestion_mobile_money.model.CompteFinancier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteFinancierRepository extends JpaRepository<CompteFinancier, Long> {
}