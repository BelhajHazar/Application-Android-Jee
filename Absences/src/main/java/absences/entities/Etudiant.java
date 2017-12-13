package absences.entities;

import java.io.Serializable;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Etudiant implements Serializable  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_etud;
	private String nom  ;
	private String prenom;
	private String cin;
	private Date date_naissance;
	
	@ManyToOne
	@JoinColumn(name="id_class")
	private Class classe;
	
	@OneToMany(mappedBy="etudiant",fetch=FetchType.LAZY)
	private List<Matiere> matiere;
	
	
	@OneToMany(mappedBy="etudiant",fetch=FetchType.LAZY)
	private List<Abscence> abscence;
	
	public long getId_etud() {
		return id_etud;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public Etudiant( String nom, String prenom, String cin, Date date_naissance) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.date_naissance = date_naissance;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant( String nom, String prenom, String cin, Date date_naissance, Class classe,
			List<Matiere> matiere, List<Abscence> abscence) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.date_naissance = date_naissance;
		this.classe = classe;
		this.matiere = matiere;
		this.abscence = abscence;
	}
	public Class getClasse() {
		return classe;
	}
	public void setClasse(Class classe) {
		this.classe = classe;
	}
	public List<Matiere> getMatiere() {
		return matiere;
	}
	public void setMatiere(List<Matiere> matiere) {
		this.matiere = matiere;
	}
	public List<Abscence> getAbscence() {
		return abscence;
	}
	public void setAbscence(Abscence absc) {
		this.abscence = (List<Abscence>)absc ;
	}
	
	

	
}