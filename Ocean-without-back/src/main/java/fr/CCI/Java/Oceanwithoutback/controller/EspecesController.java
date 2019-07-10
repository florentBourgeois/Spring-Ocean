package fr.CCI.Java.Oceanwithoutback.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import domain.Espece;

@Controller
public class EspecesController {

	//inject via application.properties
	@Value("${welcome.message}")
	private String message;
	
	@GetMapping("/")
	public String main(Model model) {
		//get especes sur API
		RestTemplate restTemplate = new RestTemplate();
		Espece[] especes = restTemplate.getForObject("http://localhost:3000/ocean/especes", Espece[].class);
		
		
		model.addAttribute("message", this.message);
		model.addAttribute("especes", especes);
		
		return "initial";
		
	}
}
