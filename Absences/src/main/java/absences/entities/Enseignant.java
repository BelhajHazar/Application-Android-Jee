package absences.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Enseignant  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_Ens;
	private  String nom;
	private  String prenom;
	private String cin;
	private Date date_naissance;
	
	@OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY)
	private List<Matiere> matiere;
	
	@OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY)
	private List<Class> classe;
	
	public long getId_Ens() {
		return id_Ens;
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
	public Enseignant(String nom, String prenom, String cin, Date date_naissance) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.date_naissance = date_naissance;
	}
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(String nom, String prenom, String cin, Date date_naissance,
			List<Matiere> matiere, List<Class> classe) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.date_naissance = date_naissance;
		this.matiere =  matiere;
		this.classe =  classe;
	}
	public void setMatiere(Matiere matiere2) {
		// TODO Auto-generated method stub
		
	}
	public void setClasse(Class classe2) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
