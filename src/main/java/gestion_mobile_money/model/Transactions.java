package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction")
    private Long idTransaction;
    @Column(name = "reference_transaction")
    private String referenceTransaction;
    @Column(name = "date_transaction")
    private LocalDateTime dateTransaction;
    private BigDecimal montant;
    @Column(name = "commission_appliquee")
    private BigDecimal commission;
    @Column(name = "telephone_beneficiaire")
    private String telephoneBeneficiaire;
    private String motif;
    private String statut;
    @Column(name = "date_validation")
    private LocalDateTime dateValidation;

    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "id_operateur")
    private Operateur operateur;
    @ManyToOne
    @JoinColumn(name = "id_type_transaction")
    private TypeTransaction typeTransaction;
    @ManyToOne
    @JoinColumn(name = "id_bareme")
    private BaremeCommission bareme;
    @ManyToOne
    @JoinColumn(name = "id_personnalisation")
    private PersonnalisationCommission personnalisation;

    public Long getIdTransaction() { return idTransaction; }
    public void setIdTransaction(Long idTransaction) { this.idTransaction = idTransaction; }
    public String getReferenceTransaction() { return referenceTransaction; }
    public void setReferenceTransaction(String referenceTransaction) { this.referenceTransaction = referenceTransaction; }
    public LocalDateTime getDateTransaction() { return dateTransaction; }
    public void setDateTransaction(LocalDateTime dateTransaction) { this.dateTransaction = dateTransaction; }
    public BigDecimal getMontant() { return montant; }
    public void setMontant(BigDecimal montant) { this.montant = montant; }
    public BigDecimal getCommission() { return commission; }
    public void setCommission(BigDecimal commission) { this.commission = commission; }
    public String getTelephoneBeneficiaire() { return telephoneBeneficiaire; }
    public void setTelephoneBeneficiaire(String telephoneBeneficiaire) { this.telephoneBeneficiaire = telephoneBeneficiaire; }
    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public LocalDateTime getDateValidation() { return dateValidation; }
    public void setDateValidation(LocalDateTime dateValidation) { this.dateValidation = dateValidation; }

    public Agence getAgence() { return agence; }
    public void setAgence(Agence agence) { this.agence = agence; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Operateur getOperateur() { return operateur; }
    public void setOperateur(Operateur operateur) { this.operateur = operateur; }
    public TypeTransaction getTypeTransaction() { return typeTransaction; }
    public void setTypeTransaction(TypeTransaction typeTransaction) { this.typeTransaction = typeTransaction; }
    public BaremeCommission getBareme() { return bareme; }
    public void setBareme(BaremeCommission bareme) { this.bareme = bareme; }
    public PersonnalisationCommission getPersonnalisation() { return personnalisation; }
    public void setPersonnalisation(PersonnalisationCommission personnalisation) { this.personnalisation = personnalisation; }
}