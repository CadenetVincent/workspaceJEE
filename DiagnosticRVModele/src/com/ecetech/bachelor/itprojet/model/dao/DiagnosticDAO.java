package com.ecetech.bachelor.itprojet.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.bachelor.itprojet.model.beans.Diagnostic;
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
 * addDiagnostic(String nom, int douleur, String cause, float temperature, boolean fatigue) 
 * retourne int (1,0,-)
 * 
 * Modifier:
 * 
 * updateDiagnosticByName(String nom, int douleur, String cause, float temperature, boolean fatigue) 
 * retourne int (1,0,-)
 * 
 * deleteDiagnosticByName(String name) 
 * retourne int (1,0,-)
 * 
 * Récupérer :
 * 
 * getAllDiagnostic() throws SQLException 
 * retourne ArrayList de Diagnostic
 * 
 * getDiagnostic(String nom) throws SQLException 
 * retourne un Diagnostic
 * 
 */


public class DiagnosticDAO {
	
	/**
	 * Selection de tous les diagnostics possibles.
	 * @param non
	 * @return : Liste de diagnostic (ArrayList)
	 */
	
	public static ArrayList<Diagnostic> getAllDiagnostic() throws SQLException 
	{
		ArrayList <Diagnostic> ListDia = new ArrayList <Diagnostic>();

		
		String req = "SELECT * FROM diagnostic ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			
			Diagnostic Dia = new Diagnostic();
			Dia.setNom(ConnexionDB.getRes().getString(1));
			Dia.setDouleur(ConnexionDB.getRes().getInt(2));
			Dia.setCause(ConnexionDB.getRes().getString(3));
			Dia.setTemperature(ConnexionDB.getRes().getFloat(4));
			Dia.setFatigue(ConnexionDB.getRes().getInt(5));
			ListDia.add(Dia);

		}
		
		ConnexionDB.DBClose();
		return ListDia;
	}
	
	
	/**
	 * Selection d'un diagnostic selon le nom attribué à la fonction.
	 * @param String nom
	 * @return : Un objet de type Diagnostic
	 */
	
	public static Diagnostic getDiagnostic(String nom) throws SQLException 
	{
		
		Diagnostic Dia = new Diagnostic();
		
		String req = "SELECT * FROM diagnostic WHERE nom = '"+nom+"' ";
		ConnexionDB.DBConnexion();
		ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
		
		while( ConnexionDB.getRes().next() )
		{	
			Dia.setNom(ConnexionDB.getRes().getString(1));
			Dia.setDouleur(ConnexionDB.getRes().getInt(2));
			Dia.setCause(ConnexionDB.getRes().getString(3));
			Dia.setTemperature(ConnexionDB.getRes().getFloat(4));
			Dia.setFatigue(ConnexionDB.getRes().getInt(5));
		}
		
		ConnexionDB.DBClose();
		return Dia;
	}
	
	/**
	 * Suppression d'un Diagnostic par son nom.
	 * @param String nom
	 * @return : Retourne 1 si le diagnostic est supprimé, 0 si aucun diagnostic supprimé et (-) si une erreur est apparue.
	 */
	
	public static int deleteDiagnosticByName(String name) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();
		
		String req = "DELETE FROM diagnostic WHERE nom = '"+name+"' ";
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
	 * Modification d'un Diagnostic par son nom.
	 * @param String nom, Int douleur, String cause, Float temperature, Boolean fatigue
	 * @return : Retourne 1 si le diagnostic est modifié, 0 si aucun diagnostic modifié et (-) si une erreur est apparue.
	 */
	
	public static int updateDiagnosticByName(String nom, int douleur, String cause, float temperature, int fatigue) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "UPDATE diagnostic SET douleur = '"+douleur+"', cause = '"+cause+"', temperature = '"+temperature+"', fatigue = '"+fatigue+"' WHERE nom ='"+nom+"' ";
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
	 * Ajout d'un Diagnostic .
	 * @param String nom, Int douleur, String cause, Float temperature, Boolean fatigue
	 * @return : Retourne 1 si le diagnostic est ajouté, 0 si aucun diagnostic ajouté et (-) si une erreur est apparue.
	 */
	
	public static int addDiagnostic(String nom, int douleur, String cause, float temperature, int fatigue) 
	{
		int result = -1;
		ConnexionDB.DBConnexion();

		String req = "INSERT INTO diagnostic (nom, douleur, cause, temperature, fatigue) VALUES ('"+nom+"','"+douleur+"','"+cause+"','"+temperature+"','"+fatigue+"') ";
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
