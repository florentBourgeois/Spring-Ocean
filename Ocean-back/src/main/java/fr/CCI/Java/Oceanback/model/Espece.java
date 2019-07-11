package fr.CCI.Java.Oceanback.model;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq, initialValue=50, allocationSize=100")
public class Espece implements ConsolePrintable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id;
	
	@Column(unique=true)
	private String nom;
	private String description;
	
        
	public Espece() {
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
