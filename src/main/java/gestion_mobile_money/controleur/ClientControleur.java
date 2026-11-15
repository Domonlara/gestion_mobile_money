package gestion_mobile_money.controleur;

import gestion_mobile_money.model.Client;
import gestion_mobile_money.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientControleur {
    private final ClientRepository repo;
    public ClientControleur(ClientRepository repo) { this.repo = repo; }
    @GetMapping public List<Client> getAll() { return repo.findAll(); }
    @PostMapping public Client create(@RequestBody Client a) { return repo.save(a); }
    @GetMapping("/{id}") public Client getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}