package gestion_mobile_money.controleur;

import gestion_mobile_money.model.CompteFinancier;
import gestion_mobile_money.repository.CompteFinancierRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comptes")
public class CompteFinancierControleur {
    private final CompteFinancierRepository repo;
    public CompteFinancierControleur(CompteFinancierRepository repo) { this.repo = repo; }
    @GetMapping public List<CompteFinancier> getAll() { return repo.findAll(); }
    @PostMapping public CompteFinancier create(@RequestBody CompteFinancier a) { return repo.save(a); }
    @GetMapping("/{id}") public CompteFinancier getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}