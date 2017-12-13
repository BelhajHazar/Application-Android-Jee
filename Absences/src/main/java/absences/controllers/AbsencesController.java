package absences.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import absences.dao.IEtudiantRepository;
import absences.entities.Etudiant;



@RestController
public class AbsencesController {

	@Autowired
	private IEtudiantRepository etudiantRepository;
	
	@RequestMapping(value="/saveEtud",method = RequestMethod.POST)
	//@RequestBody: recherche de l'objet dans le body de la httpRequest
	public Etudiant saveEtud(@RequestBody Etudiant e){
	etudiantRepository.save(e);
	return e;
	}
	
	@RequestMapping(value ="/all",method = RequestMethod.GET)
	public List<Etudiant> getEtudiant(){
	return etudiantRepository.findAll();
	}
	
	
}
