package absences.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;

@Entity
public class Abscence implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_absc;
	private Date date_absc;
	
	@ManyToOne
	@JoinColumn(name="id_etud")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name="id_mat")
	private Matiere matiere;
	
	public long getId_absc() {
		return id_absc;
	}

	public Date getDate_absc() {
		return date_absc;
	}
	public void setDate_absc(Date date_absc) {
		this.date_absc = date_absc;
	}
	public Abscence( Date date_absc) {
		super();
		
		this.date_absc = date_absc;
	}
	public Abscence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Abscence( Date date_absc, Etudiant etudiant, Matiere matiere) {
		super();

		this.date_absc = date_absc;
		this.etudiant = etudiant;
		this.matiere = matiere;
	}
	public void setEtudiant(Etudiant etud) {
		// TODO Auto-generated method stub
		
	}
	public void setEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		
	}
	public void setMatiere(Matiere matiere2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
