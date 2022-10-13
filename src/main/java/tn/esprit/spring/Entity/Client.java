package tn.esprit.spring.Entity;

import java.io.Serializable;
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
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idfornissuer")
private Long idf;
@Column(name="nom")
private String nom;

@Enumerated(EnumType.STRING)
private genre genre;
@ManyToMany(mappedBy="Client", cascade = CascadeType.ALL) 
private List<Boutique> Boutique  ;

}
