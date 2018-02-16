package com.ecetech.bachelor.itprojet.model.beans;

public class Client {

private String mdp;
private int age;
private float poids;
private float taille;
private String nom;
private String prenom;
private String mail;

public Client()
{
	this("",0,0,0,"","","");
}

public Client(String mdp, int age, float poids, float taille, String nom, String prenom, String mail) {
	super();
	this.mdp = mdp;
	this.age = age;
	this.poids = poids;
	this.taille = taille;
	this.nom = nom;
	this.prenom = prenom;
	this.mail = mail;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public float getPoids() {
	return poids;
}

public void setPoids(float poids) {
	this.poids = poids;
}

public float getTaille() {
	return taille;
}

public void setTaille(float taille) {
	this.taille = taille;
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
