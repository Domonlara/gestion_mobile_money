package gestion_mobile_money.controleur;

import gestion_mobile_money.model.TypePiece;
import gestion_mobile_money.repository.TypePieceRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/types-pieces")
public class TypePieceControleur {
    private final TypePieceRepository repo;
    public TypePieceControleur(TypePieceRepository repo) { this.repo = repo; }
    @GetMapping public List<TypePiece> getAll() { return repo.findAll(); }
    @PostMapping public TypePiece create(@RequestBody TypePiece a) { return repo.save(a); }
    @GetMapping("/{id}") public TypePiece getOne(@PathVariable Long id) { return repo.findById(id).orElse(null); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { repo.deleteById(id); }
}