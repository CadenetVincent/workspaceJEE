package com.ecetech.bachelor.itprojet.model.beans;

public class Pathologie {

private String nom;
private int niveau_urgence;
private String traitement;
private String conseil;
private String codeAnalyse;

public Pathologie()
{
	this("",0,"","","");
}

public Pathologie(String nom, int niveau_urgence, String traitement, String conseil, String codeAnalyse) {
	super();
	this.nom = nom;
	this.niveau_urgence = niveau_urgence;
	this.traitement = traitement;
	this.conseil = conseil;
	this.codeAnalyse = codeAnalyse;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getNiveau_urgence() {
	return niveau_urgence;
}

public void setNiveau_urgence(int niveau_urgence) {
	this.niveau_urgence = niveau_urgence;
}

public String getTraitement() {
	return traitement;
}

public void setTraitement(String traitement) {
	this.traitement = traitement;
}

public String getConseil() {
	return conseil;
}

public void setConseil(String conseil) {
	this.conseil = conseil;
}

public String getCodeAnalyse() {
	return codeAnalyse;
}

public void setCodeAnalyse(String codeAnalyse) {
	this.codeAnalyse = codeAnalyse;
}





}
