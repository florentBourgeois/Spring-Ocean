package fr.CCI.Java.Oceanback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

import fr.CCI.Java.Oceanback.dao.EspeceDAO;
import fr.CCI.Java.Oceanback.model.Espece;

@RestController
public class EspeceController {

	@Autowired
	private EspeceDAO especeDao;
	
	@GetMapping(value= "/especes")
	public List<Espece> listeEspeces(){
		return especeDao.findAll();
	}
}
