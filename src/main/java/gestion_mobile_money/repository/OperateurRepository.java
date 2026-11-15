package gestion_mobile_money.repository;

import gestion_mobile_money.model.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperateurRepository extends JpaRepository<Operateur, Long> {
}