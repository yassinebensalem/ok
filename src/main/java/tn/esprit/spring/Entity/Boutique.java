package tn.esprit.spring.Entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@Table(name = "Boutique")
public class Boutique implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="iddatillfacture")
private Long id;
@Column(name="nom")

private String nom;
@Enumerated(EnumType.STRING)
private Categorie categorie;
@ManyToOne
CentreCommercial CentreCommercial;

@ManyToMany(cascade = CascadeType.ALL) 
private List<Client> Client;
}