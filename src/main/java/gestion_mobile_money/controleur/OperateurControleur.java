package gestion_mobile_money.controleur;

import gestion_mobile_money.model.Operateur;
import gestion_mobile_money.repository.OperateurRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/operateurs")
public class OperateurControleur {
    private final OperateurRepository repo;
    public OperateurControleur(OperateurRepository repo) { this.repo = repo; }
    @GetMapping public List<Operateur> getAll() { return repo.findAll(); }
    @PostMapping public Operateur create(@RequestBody Operateur a) { return repo.save(a); }
    @GetMapping("/{id}") public Operateur getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}