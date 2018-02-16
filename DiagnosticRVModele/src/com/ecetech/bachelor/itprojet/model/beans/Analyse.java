package com.ecetech.bachelor.itprojet.model.beans;

public class Analyse {

private int comparaisonPositionX;
private int comparaisonPositionY;
private String comparaisonDuree;
private String code;
private String nom;
private int codeMouvement;

public Analyse()
{
	this(0,"","",0,"",0);
}

public Analyse(int comparaisonPositionX,String comparaisonDuree, String code, int comparaisonPositionY, String nom,
		int codeMouvement) {
	super();
	this.comparaisonPositionX = comparaisonPositionX;
	this.comparaisonPositionY = comparaisonPositionY;
	this.comparaisonDuree = comparaisonDuree;
	this.code = code;
	this.nom = nom;
	this.codeMouvement = codeMouvement;
}

public int getComparaisonPositionX() {
	return comparaisonPositionX;
}

public void setComparaisonPositionX(int comparaisonPositionX) {
	this.comparaisonPositionX = comparaisonPositionX;
}

public int getComparaisonPositionY() {
	return comparaisonPositionY;
}

public void setComparaisonPositionY(int comparaisonPositionY) {
	this.comparaisonPositionY = comparaisonPositionY;
}

public String getComparaisonDuree() {
	return comparaisonDuree;
}

public void setComparaisonDuree(String comparaisonDuree) {
	this.comparaisonDuree = comparaisonDuree;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getCodeMouvement() {
	return codeMouvement;
}

public void setCodeMouvement(int codeMouvement) {
	this.codeMouvement = codeMouvement;
}




}
