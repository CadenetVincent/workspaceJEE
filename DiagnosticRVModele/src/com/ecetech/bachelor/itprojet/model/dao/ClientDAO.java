package com.ecetech.bachelor.itprojet.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bachelor.itprojet.model.beans.Client;
import com.ecetech.bachelor.itprojet.model.common.ConnexionDB;

/**
 * 
 * @author Cadenet Vincent
 * 
 * @since Taha RIDENE
 * 
 * @functions
 * 
 * Ajouter:
 * 
 * addCLient(String mdp, Int age, float poids, float taille, String nom, String prenom, String mail) 
 * retourne int (1,0,-)
 * 
 * Modifier:
 * 
 * updateClientByMail(String mdp, Int age, float poids, float taille, String nom, String prenom, String mail) 
 * retourne int (1,0,-)
 * 
 *
 * deleteClientByMail(String code) 
 * retourne int (1,0,-)
 * 
 * Récupérer :
 * 
 * getAllClient() throws SQLException 
 * retourne ArrayList de Client
 * 
 * 
 * getClient(String mail,String mdp) throws SQLException 
 * retourne un Client
 */

public class ClientDAO {

/**
 * Selection de tous les clients possibles.
 * @param non
 * @return : Liste de Client (ArrayList)
 */

public static ArrayList<Client> getAllClient() throws SQLException 
{
	ArrayList <Client> ListClt = new ArrayList <Client>();

	
	String req = "SELECT * FROM client ";
	ConnexionDB.DBConnexion();
	ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
	
	while( ConnexionDB.getRes().next() )
	{	
		
		Client Clt = new Client();
		Clt.setMdp(ConnexionDB.getRes().getString(1));
		Clt.setAge(ConnexionDB.getRes().getInt(2));
		Clt.setPoids(ConnexionDB.getRes().getFloat(3));
		Clt.setTaille(ConnexionDB.getRes().getFloat(4));
		Clt.setNom(ConnexionDB.getRes().getString(5));
		Clt.setPrenom(ConnexionDB.getRes().getString(6));
		Clt.setMail(ConnexionDB.getRes().getString(7));
		ListClt.add(Clt);

	}
	
	ConnexionDB.DBClose();
	return ListClt;
}

/**
 * Selection d'un client selon son mail et son mdp.
 * @param String mail, String mdp
 * @return : Un objet de type Client
 */

public static Client getClient(String mail, String mdp) throws SQLException 
{
	
	Client Clt = new Client();
	
	String req = "SELECT * FROM client WHERE mail = '"+mail+"' AND mdp = '"+mdp+"' ";
	ConnexionDB.DBConnexion();
	ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
	
	while( ConnexionDB.getRes().next() )
	{	
		Clt.setMdp(ConnexionDB.getRes().getString(1));
		Clt.setAge(ConnexionDB.getRes().getInt(2));
		Clt.setPoids(ConnexionDB.getRes().getFloat(3));
		Clt.setTaille(ConnexionDB.getRes().getFloat(4));
		Clt.setNom(ConnexionDB.getRes().getString(5));
		Clt.setPrenom(ConnexionDB.getRes().getString(6));
		Clt.setMail(ConnexionDB.getRes().getString(7));
	}
	
	ConnexionDB.DBClose();
	return Clt;
}

/**
 * Suppression d'un Client par son mail.
 * @param String mail
 * @return : Retourne 1 si le client est supprimé, 0 si aucun client est supprimé et (-) si une erreur est apparue.
 */

public static int deleteClientByMail(String mail) 
{
	int result = -1;
	ConnexionDB.DBConnexion();
	
	String req = "DELETE FROM client WHERE mail = '"+mail+"' ";
	try {
		result = ConnexionDB.getStm().executeUpdate(req);
		System.out.println("Requete executée");	
	} catch (SQLException ex)
	{
		result = - ex.getErrorCode();
		System.out.println(ex.getMessage());
		
	}
	System.out.println("["+req+"] Suppression : Valeur de result == "+result);
	ConnexionDB.DBClose();
	return result;
}

/**
 * Modification d'un Client par son mail.
 * @param String mdp, Int age, float poids, float taille, String nom, String prenom, String mail
 * @return : Retourne 1 si le client est modifié, 0 si aucun client est modifié et (-) si une erreur est apparue.
 */

public static int updateClientByMail(String mdp, int age, float poids, float taille, String nom, String prenom, String mail) 
{
	int result = -1;
	ConnexionDB.DBConnexion();

	String req = "UPDATE client SET  mdp = '"+mdp+"', age = '"+age+"', poids = '"+poids+"', taille = '"+taille+"', nom = '"+nom+"', prenom = '"+prenom+"' WHERE mail ='"+mail+"'";
	try {
		result = ConnexionDB.getStm().executeUpdate(req);
		System.out.println("Requete executee");	
	} catch (SQLException ex)
	{
		result = - ex.getErrorCode();
	}
	ConnexionDB.DBClose();
	return result;
}

/**
 * Ajout d'un Client .
 * @param String mdp, Int age, float poids, float taille, String nom, String prenom, String mail
 * @return : Retourne 1 si le client est ajouté, 0 si aucun client est ajouté et (-) si une erreur est apparue.
 */

public static int addClient(String mdp, int age, float poids, float taille, String nom, String prenom, String mail) 
{
	int result = -1;
	ConnexionDB.DBConnexion();

	String req = "INSERT INTO Client (mdp, age, poids, taille, nom, prenom, mail) VALUES ('"+mdp+"','"+age+"','"+poids+"',"+taille+",'"+nom+"','"+prenom+"','"+mail+"') ";
	try {
		result = ConnexionDB.getStm().executeUpdate(req);
	} catch (SQLException ex)
	{
		result = - ex.getErrorCode();
		System.out.println(ex.getMessage());
	}
		
	System.out.println(req);	
	return result;
}
}
