package com.ecetech.bachelor.itprojet.model.beans;

public class Administrateur {
	
private String mdp;
private String nom;
private String prenom;
private String mail;

public Administrateur(String mdp, String nom, String prenom, String mail) {
	super();
	this.mdp = mdp;
	this.nom = nom;
	this.prenom = prenom;
	this.mail = mail;
}

public Administrateur()
{
	this("","","","");
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}






}
