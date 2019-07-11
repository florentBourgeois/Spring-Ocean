package fr.CCI.Java.Oceanback.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@SequenceGenerator(name="seq, initialValue=50, allocationSize=100")
public class Poisson implements ConsolePrintable {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int id;
	
	private String nom;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "espece_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
    private Espece type;
	
	private String photo;
	
	
	public Poisson() {
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


	public Espece getType() {
		return type;
	}


	public void setType(Espece type) {
		this.type = type;
	}



	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	/*@Override
	public String toString() {
		return "{id=" + id + ", nom=" + nom + ", type=" + type + ", localisations="
				+ Arrays.toString(localisations) + ", photo=" + photo + "}";
	}*/
	
	
	@Override
	public void consolePrint() {
		System.out.println("Poisson " + this.toString());	
	}
	
}
