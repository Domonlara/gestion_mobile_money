package gestion_mobile_money.controleur;

import gestion_mobile_money.model.TypeTransaction;
import gestion_mobile_money.repository.TypeTransactionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/types-transactions")
public class TypeTransactionControleur {
    private final TypeTransactionRepository repo;
    public TypeTransactionControleur(TypeTransactionRepository repo) { this.repo = repo; }
    @GetMapping public List<TypeTransaction> getAll() { return repo.findAll(); }
    @PostMapping public TypeTransaction create(@RequestBody TypeTransaction a) { return repo.save(a); }
    @GetMapping("/{id}") public TypeTransaction getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}