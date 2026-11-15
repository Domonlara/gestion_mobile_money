package gestion_mobile_money.model;

import jakarta.persistence.*;

@Entity
@Table(name = "type_transaction")
public class TypeTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_transaction")
    private Long idTypeTransaction;
    @Column(name = "code_type")
    private String codeType;
    private String libelle;
    private String description;
    private String statut;

    public Long getIdTypeTransaction() { return idTypeTransaction; }
    public void setIdTypeTransaction(Long idTypeTransaction) { this.idTypeTransaction = idTypeTransaction; }
    public String getCodeType() { return codeType; }
    public void setCodeType(String codeType) { this.codeType = codeType; }
    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}