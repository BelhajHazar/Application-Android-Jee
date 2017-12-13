package absences.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import absences.entities.Matiere;

public interface IMatiereRepository extends JpaRepository<Matiere, Long> {

}
