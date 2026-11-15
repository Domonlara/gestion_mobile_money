package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historique_statut")
public class HistoriqueStatut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historique")
    private Long idHistorique;
    @Column(name = "type_objet")
    private String typeObjet;
    @Column(name = "ancien_statut")
    private String ancienStatut;
    @Column(name = "nouveau_statut")
    private String nouveauStatut;
    @Column(name = "date_changement")
    private LocalDateTime dateChangement;
    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "id_transaction")
    private Transactions transaction;
    @ManyToOne
    @JoinColumn(name = "id_transfert")
    private TransfertFonds transfert;
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    public Long getIdHistorique() { return idHistorique; }
    public void setIdHistorique(Long idHistorique) { this.idHistorique = idHistorique; }
    public String getTypeObjet() { return typeObjet; }
    public void setTypeObjet(String typeObjet) { this.typeObjet = typeObjet; }
    public String getAncienStatut() { return ancienStatut; }
    public void setAncienStatut(String ancienStatut) { this.ancienStatut = ancienStatut; }
    public String getNouveauStatut() { return nouveauStatut; }
    public void setNouveauStatut(String nouveauStatut) { this.nouveauStatut = nouveauStatut; }
    public LocalDateTime getDateChangement() { return dateChangement; }
    public void setDateChangement(LocalDateTime dateChangement) { this.dateChangement = dateChangement; }
    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }
    public Transactions getTransaction() { return transaction; }
    public void setTransaction(Transactions transaction) { this.transaction = transaction; }
    public TransfertFonds getTransfert() { return transfert; }
    public void setTransfert(TransfertFonds transfert) { this.transfert = transfert; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
}