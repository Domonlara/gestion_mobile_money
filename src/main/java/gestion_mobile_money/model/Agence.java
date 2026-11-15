package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "agence")
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agence")
    private Long idAgence;
    @Column(name = "code_agence")
    private String codeAgence;
    @Column(name = "nom_agence")
    private String nomAgence;
    private String adresse;
    private String telephone;
    @Column(name = "date_creation")
    private LocalDate dateCreation;
    private String statut;

    public Long getIdAgence() { return idAgence; }
    public void setIdAgence(Long idAgence) { this.idAgence = idAgence; }
    public String getCodeAgence() { return codeAgence; }
    public void setCodeAgence(String codeAgence) { this.codeAgence = codeAgence; }
    public String getNomAgence() { return nomAgence; }
    public void setNomAgence(String nomAgence) { this.nomAgence = nomAgence; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public LocalDate getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDate dateCreation) { this.dateCreation = dateCreation; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}