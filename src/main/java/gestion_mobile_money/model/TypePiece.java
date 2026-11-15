package gestion_mobile_money.model;

import jakarta.persistence.*;

@Entity
@Table(name = "type_piece")
public class TypePiece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_piece")
    private Long idTypePiece;
    private String libelle;

    public Long getIdTypePiece() { return idTypePiece; }
    public void setIdTypePiece(Long idTypePiece) { this.idTypePiece = idTypePiece; }
    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }
}