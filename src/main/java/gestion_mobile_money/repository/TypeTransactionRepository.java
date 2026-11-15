package gestion_mobile_money.repository;

import gestion_mobile_money.model.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeTransactionRepository extends JpaRepository<TypeTransaction, Long> {
}