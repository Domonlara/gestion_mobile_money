package gestion_mobile_money.controleur;

import gestion_mobile_money.model.TransfertFonds;
import gestion_mobile_money.repository.TransfertFondsRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transferts")
public class TransfertFondsControleur {
    private final TransfertFondsRepository repo;
    public TransfertFondsControleur(TransfertFondsRepository repo) { this.repo = repo; }
    @GetMapping public List<TransfertFonds> getAll() { return repo.findAll(); }
    @PostMapping public TransfertFonds create(@RequestBody TransfertFonds a) { return repo.save(a); }
    @GetMapping("/{id}") public TransfertFonds getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}