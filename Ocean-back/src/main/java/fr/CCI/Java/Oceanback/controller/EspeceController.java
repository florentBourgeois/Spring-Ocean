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
import fr.CCI.Java.Oceanback.model.Espece;

@RestController
public class EspeceController {

	@Autowired
	private EspeceDAO especeDao;
	
	@GetMapping(value= "/especes")
	public List<Espece> listEspeces(){
		return especeDao.findAll();
	}
	
	@GetMapping(value= "/especes/{id}")
	public Espece especeByID(@PathVariable int id){
		return especeDao.findById(id);
	}
		
	@PostMapping(value = "/especes")
	public Espece createEspece(@RequestBody Espece espece) {
		return especeDao.save(espece);
	}
	
	@DeleteMapping(value = "/especes/{id}")
	public void deleteEspece(@PathVariable Integer id) {
		especeDao.deleteById(id);
	}
}
