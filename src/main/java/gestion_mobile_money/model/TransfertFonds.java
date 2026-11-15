package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transfert_fonds")
public class TransfertFonds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transfert")
    private Long idTransfert;
    @Column(name = "reference_transfert")
    private String referenceTransfert;
    @Column(name = "date_initiation")
    private LocalDateTime dateInitiation;
    @Column(name = "date_validation_source")
    private LocalDateTime dateValidationSource;
    @Column(name = "date_confirmation_reception")
    private LocalDateTime dateConfirmationReception;
    private BigDecimal montant;
    private String motif;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "id_compte_source")
    private CompteFinancier compteSource;
    @ManyToOne
    @JoinColumn(name = "id_compte_destination")
    private CompteFinancier compteDestination;
    @ManyToOne
    @JoinColumn(name = "id_initiateur")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "id_validateur_source")
    private Utilisateur validateurSource;
    @ManyToOne
    @JoinColumn(name = "id_validateur_destination")
    private Utilisateur validateurDestination;

    public Long getIdTransfert() { return idTransfert; }
    public void setIdTransfert(Long idTransfert) { this.idTransfert = idTransfert; }
    public String getReferenceTransfert() { return referenceTransfert; }
    public void setReferenceTransfert(String referenceTransfert) { this.referenceTransfert = referenceTransfert; }
    public LocalDateTime getDateInitiation() { return dateInitiation; }
    public void setDateInitiation(LocalDateTime dateInitiation) { this.dateInitiation = dateInitiation; }
    public LocalDateTime getDateValidationSource() { return dateValidationSource; }
    public void setDateValidationSource(LocalDateTime dateValidationSource) { this.dateValidationSource = dateValidationSource; }
    public LocalDateTime getDateConfirmationReception() { return dateConfirmationReception; }
    public void setDateConfirmationReception(LocalDateTime dateConfirmationReception) { this.dateConfirmationReception = dateConfirmationReception; }
    public BigDecimal getMontant() { return montant; }
    public void setMontant(BigDecimal montant) { this.montant = montant; }
    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public CompteFinancier getCompteSource() { return compteSource; }
    public void setCompteSource(CompteFinancier compteSource) { this.compteSource = compteSource; }
    public CompteFinancier getCompteDestination() { return compteDestination; }
    public void setCompteDestination(CompteFinancier compteDestination) { this.compteDestination = compteDestination; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
    public Utilisateur getValidateurSource() { return validateurSource; }
    public void setValidateurSource(Utilisateur validateurSource) { this.validateurSource = validateurSource; }
    public Utilisateur getValidateurDestination() { return validateurDestination; }
    public void setValidateurDestination(Utilisateur validateurDestination) { this.validateurDestination = validateurDestination; }
}