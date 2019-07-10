package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true) // toute propriété non liées (inconue) est ignorée
public class Espece {
	
	@JsonProperty("nom") // permet de matcher la propriété 'nom' du json en name dans la classe
	private String name;
	private String description;
	
	public Espece() {
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String nom) {
		this.name = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Espece {nom='" + name + "', description='" + description + "'}";
	}
	

	

}
