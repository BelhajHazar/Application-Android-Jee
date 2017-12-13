package absences.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
public class Class implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_class;
	private String section;
	private String annee;
	private String nom;
	
	@OneToMany(mappedBy="classe",fetch=FetchType.LAZY)
	private List<Etudiant> etudiants;
	
	@ManyToOne
	@JoinColumn(name="id_Ens")
	private Enseignant enseignant;
	
	public long getId_class() {
		return id_class;
	}
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Class( String section, String annee, String nom) {
		super();
	
		this.section = section;
		this.annee = annee;
		this.nom = nom;
	}
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class( String section, String annee, String nom, List<Etudiant> etudiant,
			Enseignant enseignant) {
		super();
	
		this.section = section;
		this.annee = annee;
		this.nom = nom;
		this.etudiants = etudiants;
		this.enseignant = enseignant;
	}
	public void setEtudiant(Etudiant etud) {
		// TODO Auto-generated method stub
		
	}
	public void setEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
