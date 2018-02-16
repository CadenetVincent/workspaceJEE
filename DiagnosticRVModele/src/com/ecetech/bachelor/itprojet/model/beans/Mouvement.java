package com.ecetech.bachelor.itprojet.model.beans;

public class Mouvement {
	
private int coordonneeX;
private int coordonneeY;
private int code;
private String tempsT;
private int origineX;
private int origineY;

public Mouvement()
{
	this(0,0,0,"",0,0);
}

public Mouvement(int coordonneeX, int coordonneeY, int code, String tempsT, int origineX, int origineY) {
	super();
	this.coordonneeX = coordonneeX;
	this.coordonneeY = coordonneeY;
	this.code = code;
	this.tempsT = tempsT;
	this.origineX = origineX;
	this.origineY = origineY;
}

public int getCoordonneeX() {
	return coordonneeX;
}

public void setCoordonneeX(int coordonneeX) {
	this.coordonneeX = coordonneeX;
}

public int getCoordonneeY() {
	return coordonneeY;
}

public void setCoordonneeY(int coordonneeY) {
	this.coordonneeY = coordonneeY;
}

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

public String getTempsT() {
	return tempsT;
}

public void setTempsT(String tempsT) {
	this.tempsT = tempsT;
}

public int getOrigineX() {
	return origineX;
}

public void setOrigineX(int origineX) {
	this.origineX = origineX;
}

public int getOrigineY() {
	return origineY;
}

public void setOrigineY(int origineY) {
	this.origineY = origineY;
}




 

}
