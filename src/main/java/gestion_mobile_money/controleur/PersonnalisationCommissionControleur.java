package gestion_mobile_money.controleur;

import gestion_mobile_money.model.PersonnalisationCommission;
import gestion_mobile_money.repository.PersonnalisationCommissionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/personnalisations")
public class PersonnalisationCommissionControleur {
    private final PersonnalisationCommissionRepository repo;
    public PersonnalisationCommissionControleur(PersonnalisationCommissionRepository repo) { this.repo = repo; }
    @GetMapping public List<PersonnalisationCommission> getAll() { return repo.findAll(); }
    @PostMapping public PersonnalisationCommission create(@RequestBody PersonnalisationCommission a) { return repo.save(a); }
    @GetMapping("/{id}") public PersonnalisationCommission getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}