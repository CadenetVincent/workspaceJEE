package com.ecetech.bachelor.itprojet.model.beans;

public class Membre {
private String nom;
private String categorieMembre;

public Membre()
{
	this("","");
}

public Membre(String nom, String categorieMembre) {
	super();
	this.nom = nom;
	this.categorieMembre = categorieMembre;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getCategorieMembre() {
	return categorieMembre;
}

public void setCategorieMembre(String categorieMembre) {
	this.categorieMembre = categorieMembre;
}




}
