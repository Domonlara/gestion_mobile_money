package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "mouvement_financier")
public class MouvementFinancier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mouvement")
    private Long idMouvement;
    @Column(name = "nature_mouvement")
    private String natureMouvement;
    private BigDecimal montant;
    @Column(name = "date_mouvement")
    private LocalDateTime dateMouvement;
    @Column(name = "reference_mouvement")
    private String referenceMouvement;
    private String motif;

    @ManyToOne
    @JoinColumn(name = "id_compte")
    private CompteFinancier compte;
    @ManyToOne
    @JoinColumn(name = "id_transaction")
    private Transactions transaction;
    @ManyToOne
    @JoinColumn(name = "id_transfert")
    private TransfertFonds transfert;
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    public Long getIdMouvement() { return idMouvement; }
    public void setIdMouvement(Long idMouvement) { this.idMouvement = idMouvement; }
    public String getNatureMouvement() { return natureMouvement; }
    public void setNatureMouvement(String natureMouvement) { this.natureMouvement = natureMouvement; }
    public BigDecimal getMontant() { return montant; }
    public void setMontant(BigDecimal montant) { this.montant = montant; }
    public LocalDateTime getDateMouvement() { return dateMouvement; }
    public void setDateMouvement(LocalDateTime dateMouvement) { this.dateMouvement = dateMouvement; }
    public String getReferenceMouvement() { return referenceMouvement; }
    public void setReferenceMouvement(String referenceMouvement) { this.referenceMouvement = referenceMouvement; }
    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }
    public CompteFinancier getCompte() { return compte; }
    public void setCompte(CompteFinancier compte) { this.compte = compte; }
    public Transactions getTransaction() { return transaction; }
    public void setTransaction(Transactions transaction) { this.transaction = transaction; }
    public TransfertFonds getTransfert() { return transfert; }
    public void setTransfert(TransfertFonds transfert) { this.transfert = transfert; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}