
package com.ecetech.bachelor.itprojet.model.beans;

public class Avatar {

	private String code;
	private String duree;
	private String categorie;
	private String lienMetrage;
	
	public Avatar()
	{
		this("","","","");
	}
	
	public Avatar(String code, String duree, String categorie, String lienMetrage) {
		super();
		this.code = code;
		this.duree = duree;
		this.categorie = categorie;
		this.lienMetrage = lienMetrage;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getLienMetrage() {
		return lienMetrage;
	}

	public void setLienMetrage(String lienMetrage) {
		this.lienMetrage = lienMetrage;
	}
			
}
