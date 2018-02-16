package com.ecetech.bachelor.itprojet.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bachelor.itprojet.model.beans.Pathologie;
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
 * addPathologie(String nom, int douleur, String cause, float temperature, boolean fatigue) 
 * retourne int (1,0,-)
 * 
 * Modifier:
 * 
 * updatePathologieByName(String nom, int douleur, String cause, float temperature, boolean fatigue) 
 * retourne int (1,0,-)
 * 
 * deleteDPathologieByName(String name) 
 * retourne int (1,0,-)
 * 
 * Récupérer :
 * 
 * getAllPathologie() throws SQLException 
 * retourne ArrayList de Pathologie
 * 
 * getPathologie(String nom) throws SQLException 
 * retourne une Pathologie
 */


public class PathologieDAO {
	
	/**
	 * Selection de toutes les pathologies possibles.
	 * @param non
	 * @return : Liste de pathologie (ArrayList)
	 */
	
	public static ArrayList<Pathologie> getAllPathologie() throws SQLException 
	{
		ArrayList <Pathologie> ListPath = new ArrayList <Pathologie>();

		
		String req = "SELECT * FROM pathologie ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			
			Pathologie Path = new Pathologie();
			Path.setNom(ConnexionDB.getRes().getString(1));
			Path.setNiveau_urgence(ConnexionDB.getRes().getInt(2));
			Path.setTraitement(ConnexionDB.getRes().getString(3));
			Path.setConseil(ConnexionDB.getRes().getString(4));
			Path.setCodeAnalyse(ConnexionDB.getRes().getString(5));
			ListPath.add(Path);

		}
		
		ConnexionDB.DBClose();
		return ListPath;
	}
	
	
	/**
	 * Selection d'une pathologie selon le nom attribué à la fonction.
	 * @param String nom
	 * @return : Un objet de type Pathologie
	 */
	
	public static Pathologie getPathologie(String nom) throws SQLException 
	{
		
		Pathologie Path = new Pathologie();
		
		String req = "SELECT * FROM pathologie WHERE nom = '"+nom+"' ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			Path.setNom(ConnexionDB.getRes().getString(1));
			Path.setNiveau_urgence(ConnexionDB.getRes().getInt(2));
			Path.setTraitement(ConnexionDB.getRes().getString(3));
			Path.setConseil(ConnexionDB.getRes().getString(4));
			Path.setCodeAnalyse(ConnexionDB.getRes().getString(5));
		}
		
		ConnexionDB.DBClose();
		return Path;
	}
	
	/**
	 * Suppression d'une Pathologie par son nom.
	 * @param String nom
	 * @return : Retourne 1 si la pathologie est supprimée, 0 si aucune pathologie est supprimé et (-) si une erreur est apparue.
	 */
	
	public static int deletePathologieByName(String name) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();
		
		String req = "DELETE FROM pathologie WHERE nom = '"+name+"' ";
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
	 * Modification d'une Pathologie par son nom.
	 * @param String nom, int niveau_urgence, String traitement, String conseil, String code
	 * @return : Retourne 1 si la pathologie est modifiée, 0 si aucune pathologie est modifiée et (-) si une erreur est apparue.
	 */
	
	public static int updatePathologieByName(String nom, int niveau_urgence, String traitement, String conseil, String code) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "UPDATE pathologie SET niveau_urgence = '"+niveau_urgence+"', traitement = '"+traitement+"', conseil = '"+conseil+"', code = '"+code+"' WHERE nom = '"+nom+"' ";
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
	 * Ajout d'une Pathologie .
	 * @param String nom, int niveau_urgence, String traitement, String conseil, String code
	 * @return : Retourne 1 si la pathologie est ajoutée, 0 si aucune pathologie est ajoutée et (-) si une erreur est apparue.
	 */
	
	public static int addPathologie(String nom, int niveau_urgence, String traitement, String conseil, String code) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "INSERT INTO pathologie (nom, niveau_urgence, traitement, conseil, code) VALUES ('"+nom+"','"+niveau_urgence+"','"+traitement+"','"+conseil+"','"+code+"') ";
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
	
	
	
	
	