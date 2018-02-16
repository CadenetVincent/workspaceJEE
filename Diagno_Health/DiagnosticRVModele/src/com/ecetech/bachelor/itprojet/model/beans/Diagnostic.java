package com.ecetech.bachelor.itprojet.model.beans;

public class Diagnostic {
	
private String nom;
private int douleur;
private String cause;
private float temperature;
private int fatigue;

public Diagnostic()
{
	this("",0,"",0,0);
}

public Diagnostic(String nom, int douleur, String cause, float temperature, int fatigue) {
	super();
	this.nom = nom;
	this.douleur = douleur;
	this.cause = cause;
	this.temperature = temperature;
	this.fatigue = fatigue;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getDouleur() {
	return douleur;
}

public void setDouleur(int douleur) {
	this.douleur = douleur;
}

public String getCause() {
	return cause;
}

public void setCause(String cause) {
	this.cause = cause;
}

public float getTemperature() {
	return temperature;
}

public void setTemperature(float temperature) {
	this.temperature = temperature;
}

public int isFatigue() {
	return fatigue;
}

public void setFatigue(int fatigue) {
	this.fatigue = fatigue;
}

}
