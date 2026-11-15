package gestion_mobile_money.controleur;

import gestion_mobile_money.model.HistoriqueStatut;
import gestion_mobile_money.repository.HistoriqueStatutRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/historiques")
public class HistoriqueStatutControleur {
    private final HistoriqueStatutRepository repo;
    public HistoriqueStatutControleur(HistoriqueStatutRepository repo) { this.repo = repo; }
    @GetMapping public List<HistoriqueStatut> getAll() { return repo.findAll(); }
    @PostMapping public HistoriqueStatut create(@RequestBody HistoriqueStatut a) { return repo.save(a); }
    @GetMapping("/{id}") public HistoriqueStatut getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}