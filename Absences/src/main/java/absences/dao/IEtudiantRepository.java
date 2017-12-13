package absences.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import absences.entities.Etudiant;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {

}
