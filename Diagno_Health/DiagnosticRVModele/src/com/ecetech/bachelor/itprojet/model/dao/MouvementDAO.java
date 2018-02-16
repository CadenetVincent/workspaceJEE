package com.ecetech.bachelor.itprojet.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bachelor.itprojet.model.beans.Mouvement;
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
 * addMouvement(int coordonnee_x, int coordonnee_y, int code, String temps_t, int origine_x, int origine_y) 
 * retourne int (1,0,-)
 * 
 * deleteMouvementByCode(int code) 
 * retourne int (1,0,-)
 * 
 * Récupérer :
 * 
 * getAllMouvement() throws SQLException 
 * retourne ArrayList de Mouvement
 * 
 * getMouvement(int code) throws SQLException 
 * retourne un Mouvement
 */


public class MouvementDAO {
	
	/**
	 * Selection de tous les mouvemements possibles.
	 * @param non
	 * @return : Liste de Mouvements (ArrayList)
	 */

	public static ArrayList<Mouvement> getAllMouvement() throws SQLException 
	{
		ArrayList <Mouvement> ListMvt = new ArrayList <Mouvement>();

		
		String req = "SELECT * FROM mouvement ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			
			Mouvement Mvt = new Mouvement();
			Mvt.setCoordonneeX(ConnexionDB.getRes().getInt(1));
			Mvt.setCoordonneeY(ConnexionDB.getRes().getInt(2));
			Mvt.setCode(ConnexionDB.getRes().getInt(3));
			Mvt.setTempsT(ConnexionDB.getRes().getString(4));
			Mvt.setOrigineX(ConnexionDB.getRes().getInt(5));
			Mvt.setOrigineY(ConnexionDB.getRes().getInt(6));
			ListMvt.add(Mvt);

		}
		
		ConnexionDB.DBClose();
		return ListMvt;
	}

	/**
	 * Selection d'un mouvement selon son code.
	 * @param Int code
	 * @return : Un objet de type Mouvement
	 */

	public static Mouvement getMouvement(int code) throws SQLException 
	{
		
		Mouvement Mvt = new Mouvement();
		
		String req = "SELECT * FROM mouvement WHERE code = '"+code+"'";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			Mvt.setCoordonneeX(ConnexionDB.getRes().getInt(1));
			Mvt.setCoordonneeY(ConnexionDB.getRes().getInt(2));
			Mvt.setCode(ConnexionDB.getRes().getInt(3));
			Mvt.setTempsT(ConnexionDB.getRes().getString(4));
			Mvt.setOrigineX(ConnexionDB.getRes().getInt(5));
			Mvt.setOrigineY(ConnexionDB.getRes().getInt(6));
		}
		
		ConnexionDB.DBClose();
		return Mvt;
	}

	/**
	 * Suppression d'un mouvement par son code.
	 * @param Int code
	 * @return : Retourne 1 si le mouvement est supprimé, 0 si aucun mouvement est supprimé et (-) si une erreur est apparue.
	 */

	public static int deleteMouvementByCode(int code) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();
		
		String req = "DELETE FROM mouvement WHERE code = '"+code+"' ";
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
	 * Ajout d'un Mouvement.
	 * @param int coordonnee_x, int coordonnee_y, int code, String temps_t, int orgine_x, int origine_y
	 * @return : Retourne 1 si le mouvement est ajouté, 0 si aucun mouvement est ajouté et (-) si une erreur est apparue.
	 */

	public static int addMouvement(int coordonnee_x, int coordonnee_y, int code, String temps_t, int origine_x, int origine_y) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "INSERT INTO mouvement (coordonnee_x, coordonnee_y, code, temps_t, origine_x, origine_y) VALUES ('"+coordonnee_x+"','"+coordonnee_y+"','"+code+"','"+temps_t+"','"+origine_x+"','"+origine_y+"') ";
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
