package gestion_mobile_money.model;

import jakarta.persistence.*;

@Entity
@Table(name = "operateur")
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operateur")
    private Long idOperateur;
    @Column(name = "code_operateur")
    private String codeOperateur;
    @Column(name = "nom_operateur")
    private String nomOperateur;
    private String description;
    private String statut;

    public Long getIdOperateur() { return idOperateur; }
    public void setIdOperateur(Long idOperateur) { this.idOperateur = idOperateur; }
    public String getCodeOperateur() { return codeOperateur; }
    public void setCodeOperateur(String codeOperateur) { this.codeOperateur = codeOperateur; }
    public String getNomOperateur() { return nomOperateur; }
    public void setNomOperateur(String nomOperateur) { this.nomOperateur = nomOperateur; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}