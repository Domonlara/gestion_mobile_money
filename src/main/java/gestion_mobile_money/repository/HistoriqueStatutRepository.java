package gestion_mobile_money.repository;

import gestion_mobile_money.model.HistoriqueStatut;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqueStatutRepository extends JpaRepository<HistoriqueStatut, Long> {
}