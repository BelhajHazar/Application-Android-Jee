package absences.services;
import java.util.List; 
import javax.jws.WebMethod; 
import javax.jws.WebParam;
import javax.jws.WebService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import absences.dao.IEtudiantRepository;
import absences.entities.Etudiant;
@Component
@WebService
public class AbsencesService {
	@Autowired
	private IEtudiantRepository etudiantRepository;
	@WebMethod
	public List<Etudiant> allEtudiant(){
	return etudiantRepository.findAll();
	}

}
