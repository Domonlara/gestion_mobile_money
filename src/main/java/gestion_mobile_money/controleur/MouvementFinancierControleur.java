package gestion_mobile_money.controleur;

import gestion_mobile_money.model.MouvementFinancier;
import gestion_mobile_money.repository.MouvementFinancierRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mouvements")
public class MouvementFinancierControleur {
    private final MouvementFinancierRepository repo;
    public MouvementFinancierControleur(MouvementFinancierRepository repo) { this.repo = repo; }
    @GetMapping public List<MouvementFinancier> getAll() { return repo.findAll(); }
    @PostMapping public MouvementFinancier create(@RequestBody MouvementFinancier a) { return repo.save(a); }
    @GetMapping("/{id}") public MouvementFinancier getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}