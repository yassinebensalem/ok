package tn.esprit.spring.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tn.esprit.spring.Entity.Boutique;

@Entity
@Table(name = "CentreCommercial")
public class CentreCommercial implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long id;
private String nom;
private String adresse;
private String login;
private String passord;
@OneToMany(cascade = CascadeType.ALL, mappedBy="CentreCommercial")
private List<Boutique> Boutique;




} 
