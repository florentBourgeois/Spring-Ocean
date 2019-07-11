package fr.CCI.Java.Oceanfront.bean;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EspeceBean implements ConsolePrintable{
	
	private int id;
	private String nom;
	private String description;
	
        
	public EspeceBean() {
	}
		
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public void consolePrint() {
		 System.out.println("Espece : " + this.toString()); 
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("{id= '").append(this.id).append("'");
		sb.append(", nom='").append(this.nom).append("'");
		sb.append(", description='").append(this.description).append("'}");
		return sb.toString();
	}
	
	
	

}
