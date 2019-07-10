package fr.CCI.Java.Oceanwithoutback;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import domain.Espece;

@SpringBootApplication
public class OceanWithoutBackApplication {

	//private static final Logger log = LoggerFactory.getLogger(OceanWithoutBackApplication.class);
	
	public static void main(String[] args) {
		// requete à l'API et transformation en tableau d'espece
		RestTemplate restTemplate = new RestTemplate();
		Espece[] especes = restTemplate.getForObject("http://localhost:3000/ocean/especes", Espece[].class);
		
		for (Espece espece : especes) {
			//log.info(espece.toString());
			System.out.println(espece);
		}
		
//		SpringApplication.run(OceanWithoutBackApplication.class, args);

	}

}
