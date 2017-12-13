package absences.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
public class Matiere implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_mat;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="id_etud")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name="id_ens")
	private Enseignant enseignant;
	
	@OneToMany(mappedBy="matiere",fetch=FetchType.LAZY)
	private List<Abscence> abscence;
	
	public long getId_mat() {
		return id_mat;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Matiere(String nom) {
		super();
	
		this.nom = nom;
	}
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Matiere( String nom, Etudiant etudiant, Enseignant enseignant, List<Abscence> abscence) {
		super();

		this.nom = nom;
		this.etudiant = etudiant;
		this.enseignant = enseignant;
		this.abscence = abscence;
	}
	public void setEtudiant(Etudiant etud) {
		// TODO Auto-generated method stub
		
	}
	public void setEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		
	}
	public void setAbscence(Abscence absc) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
