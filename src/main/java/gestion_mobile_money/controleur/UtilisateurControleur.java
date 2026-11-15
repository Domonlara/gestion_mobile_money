package gestion_mobile_money.controleur;

import gestion_mobile_money.model.Utilisateur;
import gestion_mobile_money.repository.UtilisateurRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurControleur {
    private final UtilisateurRepository repo;
    public UtilisateurControleur(UtilisateurRepository repo) { this.repo = repo; }
    @GetMapping public List<Utilisateur> getAll() { return repo.findAll(); }
    @PostMapping public Utilisateur create(@RequestBody Utilisateur a) { return repo.save(a); }
    @GetMapping("/{id}") public Utilisateur getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}