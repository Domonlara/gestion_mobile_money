package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long idClient;
    private String nom;
    private String prenom;
    private String sexe;
    private String telephone;
    @Column(name = "numero_piece")
    private String numeroPiece;
    @Column(name = "date_delivrance")
    private LocalDate dateDelivrance;

    @ManyToOne
    @JoinColumn(name = "id_type_piece")
    private TypePiece typePiece;

    public Long getIdClient() { return idClient; }
    public void setIdClient(Long idClient) { this.idClient = idClient; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getSexe() { return sexe; }
    public void setSexe(String sexe) { this.sexe = sexe; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public String getNumeroPiece() { return numeroPiece; }
    public void setNumeroPiece(String numeroPiece) { this.numeroPiece = numeroPiece; }
    public LocalDate getDateDelivrance() { return dateDelivrance; }
    public void setStatut(LocalDate dateDelivrance) { this.dateDelivrance = dateDelivrance; }
    public TypePiece getTypePiece() { return typePiece; }
    public void setTypePiece(TypePiece typePiece) { this.typePiece = typePiece; }
}