package gestion_mobile_money.controleur;

import gestion_mobile_money.model.Agence;
import gestion_mobile_money.repository.AgenceRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/agences")
public class AgenceControleur {

    private final AgenceRepository repo;
    public AgenceControleur(AgenceRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Agence> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Agence create(@RequestBody Agence a) {
        return repo.save(a);
    }

    @GetMapping("/{id}")
    public Agence getOne(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}