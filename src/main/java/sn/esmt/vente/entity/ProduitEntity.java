package sn.esmt.vente.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="Produit")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
  @Id
  @Column(name="ref",length = 10)
  private String ref;
  @Column(name="nom",length = 10,nullable = false)
  private String nom;
  @Column(name="qtStock")
  private double qtStock;

}

