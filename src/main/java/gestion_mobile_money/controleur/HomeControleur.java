package gestion_mobile_money.controleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControleur {

    @GetMapping("/")
    public String accueil() {
        return "Bienvenue sur mon application Mobile Money - Ca marche !";
    }
}