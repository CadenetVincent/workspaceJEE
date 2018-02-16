package com.ecetech.bachelor.itprojet.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bachelor.itprojet.model.beans.Administrateur;
import com.ecetech.bachelor.itprojet.model.common.ConnexionDB;

/**
 * 
 * @author Cadenet Vincent
 * 
 * @since Taha RIDENE
 * 
 * @functions
 * 
 * Récupérer :
 * 
 * getAllAdministrateur()
 * retourne la liste des administrateurs
 * 
 * getAdministrateur(String mail,String mdp) throws SQLException 
 * retourne un Administrateur
 */

public class AdministrateurDAO {
	

	
public static ArrayList<Administrateur> getAllAdministrateur() throws SQLException 
{
	ArrayList <Administrateur> ListAdmin = new ArrayList <Administrateur>();

	
	String req = "SELECT * FROM administrateur ";
	ConnexionDB.DBConnexion();
	ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
	
	while( ConnexionDB.getRes().next() )
	{	
		Administrateur Admin = new Administrateur();
		Admin.setMdp(ConnexionDB.getRes().getString(1));
		Admin.setNom(ConnexionDB.getRes().getString(2));
		Admin.setPrenom(ConnexionDB.getRes().getString(3));
		Admin.setMail(ConnexionDB.getRes().getString(4));
		ListAdmin.add(Admin);

	}
	
	ConnexionDB.DBClose();
	return ListAdmin;
}
	
	/**
	 * Selection d'un administrateur selon son mail et son mdp.
	 * @param String mail, String mdp
	 * @return : Un objet de type Administrateur
	 */
	
	public static Administrateur getAdministrateur(String mail, String mdp) throws SQLException 
	{
		
		Administrateur Admin = new Administrateur();
		
		String req = "SELECT * FROM administrateur WHERE mail = '"+mail+"' AND mdp = '"+mdp+"' ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			Admin.setMdp(ConnexionDB.getRes().getString(1));
			Admin.setNom(ConnexionDB.getRes().getString(2));
			Admin.setPrenom(ConnexionDB.getRes().getString(3));
			Admin.setMail(ConnexionDB.getRes().getString(4));
		}
		
		ConnexionDB.DBClose();
		return Admin;
	}
	
}
