package absences.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import absences.entities.Abscence;


public interface IAbsencesRepository extends JpaRepository<Abscence, Long> {
	@Query("select a from Abscence a where a.date_absc like :x")
	public Page<Abscence> AbscenceParMatiere(@Param("x")String mc,Pageable p);
	@Query("select a from Abscence a where a.date_absc like :x")
	public List<Abscence> findBydate_absc(@Param("x")String absc);


}
