package absences.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import absences.entities.Enseignant;

public interface IEnseignatRepository extends JpaRepository<Enseignant, Long> {

}
