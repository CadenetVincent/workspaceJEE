package com.ecetech.bachelor.itprojet.model.dao;

import java.sql.SQLException;

import com.ecetech.bachelor.itprojet.model.beans.Analyse;
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
 * addAnalye(int comparaison_position_x, String comparaison_duree, String code, int comparaison_position_y, String nom, int code_MOUVEMENT) 
 * retourne int (1,0,-)
 * 
 * Supprimer:
 * 
 * deleteAnalyseByCode(String code)
 * retourne int (1,0,-)
 * 
 * Récupérer :
 * 
 * getAnalyse(String code) throws SQLException 
 * retourne une Analyse
 * 
 */


public class AnalyseDAO {
	

	/**
	 * Selection d'une analyse selon son code.
	 * @param Int code
	 * @return : Un objet de type Analyse
	 */

	public static Analyse getAnalyse(String code) throws SQLException 
	{
		
		Analyse Anl = new Analyse();
		
		String req = "SELECT * FROM analyse WHERE code = '"+code+"'";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next())
		{	
			Anl.setComparaisonPositionX(ConnexionDB.getRes().getInt(1));
			Anl.setComparaisonDuree(ConnexionDB.getRes().getString(2));
			Anl.setCode(ConnexionDB.getRes().getString(3));
			Anl.setComparaisonPositionY(ConnexionDB.getRes().getInt(4));
			Anl.setNom(ConnexionDB.getRes().getString(5));
			Anl.setCodeMouvement(ConnexionDB.getRes().getInt(6));
		}
		
		ConnexionDB.DBClose();
		return Anl;
	}

	/**
	 * Suppression d'une analyse par son code.
	 * @param Int code
	 * @return : Retourne 1 si l'analyse est supprimée, 0 si aucune analyse est supprimée et (-) si une erreur est apparue.
	 */

	public static int deleteAnalyseByCode(String code) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();
		
		String req = "DELETE FROM analyse WHERE code = '"+code+"' ";
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
	 * Ajout d'une Analyse.
	 * @param int comparaison_position_x, String comparaison_duree, String code, int comparaison_position_y, String nom, int code_MOUVEMENT 
	 * @return : Retourne 1 si l'analyse est ajoutée, 0 si aucune analyse est ajouté et (-) si une erreur est apparue.
	 */

	public static int addAnalyse(int comparaison_position_x, String comparaison_duree, String code, int comparaison_position_y, String nom, int code_MOUVEMENT) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "INSERT INTO analyse (comparaison_position_x, comparaison_duree, code, comparaison_position_y, nom, code_MOUVEMENT ) VALUES ('"+comparaison_position_x+"','"+comparaison_duree+"','"+code+"',"+comparaison_position_y+",'"+nom+"','"+code_MOUVEMENT+"') ";
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
