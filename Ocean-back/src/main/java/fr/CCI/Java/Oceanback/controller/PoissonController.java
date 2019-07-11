package fr.CCI.Java.Oceanback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.CCI.Java.Oceanback.dao.EspeceDAO;
import fr.CCI.Java.Oceanback.dao.PoissonDAO;
import fr.CCI.Java.Oceanback.model.Espece;
import fr.CCI.Java.Oceanback.model.Poisson;

@RestController
public class PoissonController {

	@Autowired
	private PoissonDAO poissonDao;
	
	@Autowired
    private EspeceDAO especeDao;
	
	@GetMapping(value= "/poissons")
	public List<Poisson> listPoisson(){
		return poissonDao.findAll();
	}
	
	@GetMapping("/especes/{especeID}/poissons")
    public List<Poisson> getAllPoissonsByEspeceId(@PathVariable (value = "especeID") Integer especeID) {
        return poissonDao.findByTypeId(especeID);
    }
	
	@GetMapping(value= "poissons/{poissonID}/espece")
	public Espece getPoissonEspece(@PathVariable (value = "poissonID") int poissonID) {
		Espece e = poissonDao.findById(poissonID).getType();
		return e;
	}

	
	@PostMapping(value = "/poissons")
	public Poisson createPoisson(@RequestBody Poisson poisson) {
		return poissonDao.save(poisson);
	}
	
	@DeleteMapping(value = "/poissons/{id}")
	public void deletePoisson(@PathVariable Integer id) {
		poissonDao.deleteById(id);
	}
	
	
	
}
