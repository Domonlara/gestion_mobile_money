package gestion_mobile_money.controleur;

import gestion_mobile_money.model.Transactions;
import gestion_mobile_money.repository.TransactionsRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionsControleur {
    private final TransactionsRepository repo;
    public TransactionsControleur(TransactionsRepository repo) { this.repo = repo; }
    @GetMapping public List<Transactions> getAll() { return repo.findAll(); }
    @PostMapping public Transactions create(@RequestBody Transactions a) { return repo.save(a); }
    @GetMapping("/{id}") public Transactions getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}