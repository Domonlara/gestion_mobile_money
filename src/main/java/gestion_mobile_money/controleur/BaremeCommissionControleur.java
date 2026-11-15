package gestion_mobile_money.controleur;

import gestion_mobile_money.model.BaremeCommission;
import gestion_mobile_money.repository.BaremeCommissionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/baremes")
public class BaremeCommissionControleur {
    private final BaremeCommissionRepository repo;
    public BaremeCommissionControleur(BaremeCommissionRepository repo) { this.repo = repo; }
    @GetMapping public List<BaremeCommission> getAll() { return repo.findAll(); }
    @PostMapping public BaremeCommission create(@RequestBody BaremeCommission a) { return repo.save(a); }
    @GetMapping("/{id}") public BaremeCommission getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}