package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "compte_financier")
public class CompteFinancier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compte")
    private Long idCompte;
    @Column(name = "libelle_compte")
    private String LibelleCompte;
    @Column(name = "type_compte")
    private String TypeCompte;
    private BigDecimal solde_initial;
    @Column(name = "date_ouverture")
    private LocalDateTime dateOuverture;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;
    @ManyToOne
    @JoinColumn(name = "id_operateur")
    private Operateur operateur;

    public Long getIdCompte() { return idCompte; }
    public void setIdCompte(Long idCompte) { this.idCompte = idCompte; }
    public String getLibelleCompte() { return LibelleCompte; }
    public void setLibelleCompte(String LibelleCompte) { this.LibelleCompte = LibelleCompte; }
    public String getTypeCompte() { return TypeCompte; }
    public void setTypeCompte(String TypeCompte) { this.TypeCompte = TypeCompte; }
    public BigDecimal getSoldeInitial() { return solde_initial; }
    public void setSoldeInitial(BigDecimal solde_initial) { this.solde_initial = solde_initial; }
    public LocalDateTime getDateOuverture() { return dateOuverture; }
    public void setDateOuverture(LocalDateTime dateOuverture) { this.dateOuverture = dateOuverture; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public Agence getAgence() { return agence; }
    public void setAgence(Agence agence) { this.agence = agence; }
    public Operateur getOperateur() { return operateur; }
    public void setOperateur(Operateur operateur) { this.operateur = operateur; }
}