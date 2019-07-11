package fr.CCI.Java.Oceanfront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.CCI.Java.Oceanfront.bean.EspeceBean;
import fr.CCI.Java.Oceanfront.bean.PoissonBean;
import fr.CCI.Java.Oceanfront.proxy.MicroserviceOceanProxy;


@Controller
public class VueHTMLEspecesController {

	
	// on utilise un MicroserviceProduitProxy pour se connecter au microservice du projet boulanger-microservice
	@Autowired
	private MicroserviceOceanProxy oceanProxy;

	
	// lorsque l'utilisateur demande la page accueil on veut afficher la liste des especes
	@GetMapping(value= "/especes")
	public String pageAccueil(Model model) { // Model est l'objet qui sera passé en paramettre dans la page html.
		List<EspeceBean> especes = oceanProxy.listEsepeces(); // utiliser le proxy pour demander au microservice de produit la liste des produits.
		System.err.println(especes);
		for (EspeceBean espece : especes) {
			System.err.println("espece" + espece);
		}
		
		model.addAttribute("especes", especes); // on ajout les espces dans le modèle pour que la page html puisse y acceder
		return "especesHTML"; // faire le rendu de la page especeHTML.html
	}
	
	//détail les poissons d'une espece 
	@GetMapping(value= "/especes/{id}")
	public String pageAccueil(@PathVariable int id, Model model) { 
		EspeceBean espece = oceanProxy.especeByID(id);
		System.err.println(espece);
		
		List<PoissonBean> poissons = oceanProxy.getAllPoissonsByEspeceId(id);
		model.addAttribute("espece", espece);
		model.addAttribute("poissons", poissons);
		return "especeDetailHTML"; 
	}
	
	
	
}

