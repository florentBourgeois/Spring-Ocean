package fr.CCI.Java.Oceanfront.bean;

import java.util.Arrays;

public class PoissonBean implements ConsolePrintable {

	private int id;
	private String nom;
	private EspeceBean type;
	private String photo;
	
	
	public PoissonBean() {
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


	public EspeceBean getType() {
		return type;
	}


	public void setType(EspeceBean type) {
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
