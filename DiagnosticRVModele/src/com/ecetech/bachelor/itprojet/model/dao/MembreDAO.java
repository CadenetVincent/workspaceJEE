package com.ecetech.bachelor.itprojet.model.dao;


	import java.sql.SQLException;
	import java.util.ArrayList;

import com.ecetech.bachelor.itprojet.model.beans.Membre;
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
	 * addMembre(String nom, String categorie_membre) 
	 * retourne int (1,0,-)
	 * 
	 * Modifier:
	 * 
	 * updateMembreByName(String nom, String categorie_membre) 
	 * retourne int (1,0,-)
	 * 
	 * deleteMembreByName(String name) 
	 * retourne int (1,0,-)
	 * 
	 * Récupérer :
	 * 
	 * getAllMembre() throws SQLException 
	 * retourne ArrayList de membre
	 * 
	 * getMembre(String nom) throws SQLException 
	 * retourne un membre
	 * 
	 */


	public class MembreDAO {
		
		/**
		 * Selection de tous les membres possibles.
		 * @param non
		 * @return : Liste de Membre (ArrayList)
		 */
		
		public static ArrayList<Membre> getAllMembre() throws SQLException 
		{
			ArrayList <Membre> ListMembre = new ArrayList <Membre>();
			String req = "SELECT * FROM membre ";
			ConnexionDB.DBConnexion();
			ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
			
			while( ConnexionDB.getRes().next() )
			{	
				Membre Mbre = new Membre();
				Mbre.setNom(ConnexionDB.getRes().getString(1));
				Mbre.setCategorieMembre(ConnexionDB.getRes().getString(2));
				ListMembre.add(Mbre);
			}
			
			ConnexionDB.DBClose();
			return ListMembre;
		}
		
		
		/**
		 * Selection d'un membre selon le nom attribué à la fonction.
		 * @param String nom
		 * @return : Un objet de type Membre
		 */
		
		public static Membre getMembre(String nom) throws SQLException 
		{
			Membre Mbre = new Membre();
			String req = "SELECT * FROM membre WHERE nom = '"+nom+"' ";
			ConnexionDB.DBConnexion();
			ConnexionDB.setRes(ConnexionDB.getStm().executeQuery(req));
			
			while( ConnexionDB.getRes().next() )
			{	
				Mbre.setNom(ConnexionDB.getRes().getString(1));
				Mbre.setCategorieMembre(ConnexionDB.getRes().getString(2));
			}
			
			ConnexionDB.DBClose();
			return Mbre;
		}
		
		/**
		 * Suppression d'un membre par son nom.
		 * @param String nom
		 * @return : Retourne 1 si le membre est supprimé, 0 si aucun membre est supprimé et (-) si une erreur est apparue.
		 */
		
		public static int deleteMembreByName(String name) 
		{
			int result = -1;
			ConnexionDB.DBConnexion();
			
			String req = "DELETE FROM membre WHERE nom = '"+name+"' ";
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
		 * Modification d'un membre par son nom.
		 * @param String nom, String categorie_membre
		 * @return : Retourne 1 si le membre est modifié, 0 si aucun membre est modifié et (-) si une erreur est apparue.
		 */
		
		public static int updateMembreByName(String nom, String categorie_membre) 
		{
			int result = -1;
			ConnexionDB.DBConnexion();

			String req = "UPDATE membre SET categorie_membre = '"+categorie_membre+"' WHERE nom ='"+nom+"'";
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
		 * Ajout d'un membre .
		 * @param String nom, String categorie_membre
		 * @return : Retourne 1 si le membre est ajouté, 0 si aucun membre ajouté et (-) si une erreur est apparue.
		 */
		
		public static int addMembre(String nom, String categorie_membre) 
		{
			int result = -1;
			ConnexionDB.DBConnexion();

			String req = "INSERT INTO membre (nom, categorie_membre) VALUES ('"+nom+"','"+categorie_membre+"') ";
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



