package com.ecetech.bachelor.itprojet.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bachelor.itprojet.model.beans.Avatar;
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
 * addAvatar(String nom, int douleur, String cause, float temperature, boolean fatigue) 
 * retourne int (1,0,-)
 * 
 * Modifier:
 * 
 * updateAvatarByName(String nom, int douleur, String cause, float temperature, boolean fatigue) 
 * retourne int (1,0,-)
 * 
 * deleteAvatarByName(String code) 
 * retourne int (1,0,-)
 * 
 * Récupérer :
 * 
 * getAllAvatar() throws SQLException 
 * retourne ArrayList d'Avatar
 * 
 * getAvatar(String code) throws SQLException 
 * retourne un Avatar
 */

public class AvatarDAO {
	
	/**
	 * Selection de tous les avatars possibles.
	 * @param non
	 * @return : Liste d'avatars (ArrayList)
	 */
	
	public static ArrayList<Avatar> getAllAvatar() throws SQLException 
	{
		ArrayList <Avatar> ListAvt = new ArrayList <Avatar>();

		
		String req = "SELECT * FROM avatar ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			
			Avatar Avt = new Avatar();
			Avt.setCode(ConnexionDB.getRes().getString(1));
			Avt.setDuree(ConnexionDB.getRes().getString(2));
			Avt.setCategorie(ConnexionDB.getRes().getString(3));
			Avt.setLienMetrage(ConnexionDB.getRes().getString(4));
			ListAvt.add(Avt);

		}
		
		ConnexionDB.DBClose();
		return ListAvt;
	}
	
	
	/**
	 * Selection d'un avatar selon le code attribué à la fonction.
	 * @param String code
	 * @return : Un objet de type Avatar
	 */
	
	public static Avatar getAvatar(String code) throws SQLException 
	{
		
		Avatar Avt = new Avatar();
		
		String req = "SELECT * FROM avatar WHERE code = '"+code+"' ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			Avt.setCode(ConnexionDB.getRes().getString(1));
			Avt.setDuree(ConnexionDB.getRes().getString(2));
			Avt.setCategorie(ConnexionDB.getRes().getString(3));
			Avt.setLienMetrage(ConnexionDB.getRes().getString(4));
		}
		
		ConnexionDB.DBClose();
		return Avt;
	}
	
	/**
	 * Suppression d'un Avatar par son code.
	 * @param String code
	 * @return : Retourne 1 si l'avatar est supprimé, 0 si aucun diagnostic supprimé et (-) si une erreur est apparue.
	 */
	
	public static int deleteAvatarByCode(String code) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();
		
		String req = "DELETE FROM avatar WHERE code = '"+code+"' ";
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
	 * Modification d'un Avatar par son code.
	 * @param String code, String duree, String categorie, Float lien_metrage
	 * @return : Retourne 1 si l'avatar est modifié, 0 si aucun avatar modifié et (-) si une erreur est apparue.
	 */
	
	public static int updateAvatarByCode(String code, String duree, String categorie, String lien_metrage) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "UPDATE avatar SET duree = '"+duree+"', categorie = '"+categorie+"', lien_metrage = '"+lien_metrage+"' WHERE code = '"+code+"'";
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
	 * Ajout d'un Avatar .
	 * @param String code, String duree, String categorie, Float lien_metrage
	 * @return : Retourne 1 si l'avatar est ajouté, 0 si aucun avatar ajouté et (-) si une erreur est apparue.
	 */
	
	public static int addAvatar(String code, String duree, String categorie, String lien_metrage) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "INSERT INTO avatar (code, duree, categorie, lien_metrage) VALUES ('"+code+"','"+duree+"','"+categorie+"','"+lien_metrage+"') ";
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
