package gestion_mobile_money.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "personnalisation_commission")
public class PersonnalisationCommission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personnalisation")
    private Long idPersonnalisation;
    @Column(name = "commission_personnalisee")
    private BigDecimal commissionPersonnalise;
    @Column(name = "date_debut")
    private LocalDate dateDebut;
    @Column(name = "date_fin")
    private LocalDate dateFin;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;
    @ManyToOne
    @JoinColumn(name = "id_bareme")
    private BaremeCommission baremeCommission;

    public Long getIdPersonnalisation() { return idPersonnalisation; }
    public void setIdPersonnalisation(Long idPersonnalisation) { this.idPersonnalisation = idPersonnalisation; }
    public BigDecimal getCommissionPersonnalise() { return commissionPersonnalise; }
    public void setCommissionPersonnalise(BigDecimal commissionPersonnalise) { this.commissionPersonnalise = commissionPersonnalise; }
    public LocalDate getDateDebut() { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }
    public LocalDate getDateFin() { return dateFin; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public Agence getAgence() { return agence; }
    public void setAgence(Agence agence) { this.agence = agence; }
    public BaremeCommission getBaremeCommission() { return baremeCommission; }
    public void setBaremeCommission(BaremeCommission baremeCommission) { this.baremeCommission = baremeCommission; }
}