package gestion_mobile_money.repository;

import gestion_mobile_money.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}