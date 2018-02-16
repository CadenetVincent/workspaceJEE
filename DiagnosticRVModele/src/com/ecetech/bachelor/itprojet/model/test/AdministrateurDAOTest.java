package com.ecetech.bachelor.itprojet.model.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.beans.Administrateur;
import com.ecetech.bachelor.itprojet.model.dao.AdministrateurDAO;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Cadenet Vincent
 * 
 * @since Taha RIDENE
 *
 */

public class AdministrateurDAOTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
			
	}
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#getAllAdministrateur()}.
	 * @throws SQLException 
	 */
	@Test
	public void getALLAdministrateurTest() throws SQLException 
	{
		 
		 ArrayList<Administrateur> listAdmin = new ArrayList<Administrateur>();
		 
		 Administrateur admin1 = new Administrateur("aube", "Aube", "Nicolas","nicoaube@gmail.fr");
		 Administrateur admin2 = new Administrateur("netcad", "Cadenet", "Vincent","vincad-20@hotmail.fr");
		 Administrateur admin3 = new Administrateur("repas", "Repas", "Richard","richardrepas@gmail.fr");
		 
		 listAdmin.add(admin1);
		 listAdmin.add(admin2);
		 listAdmin.add(admin3);
	
		
		 for( int i =0; i < listAdmin.size(); i++ )
		 {  
			 assertEquals(listAdmin.get(i).getMdp(),AdministrateurDAO.getAllAdministrateur().get(i).getMdp());
			 assertEquals(listAdmin.get(i).getNom(),AdministrateurDAO.getAllAdministrateur().get(i).getNom());
			 assertEquals(listAdmin.get(i).getPrenom(),AdministrateurDAO.getAllAdministrateur().get(i).getPrenom());
			 assertEquals(listAdmin.get(i).getMail(),AdministrateurDAO.getAllAdministrateur().get(i).getMail());
			
		 }
	}
	
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#getAdministrateur()}.
	 * @throws SQLException 
	 */
	
	@Test
	public void getAdministrateurTest() throws SQLException 
	{
		 
		 ArrayList<Administrateur> listAdmin = new ArrayList<Administrateur>();
		 
		 Administrateur admin1 = new Administrateur("aube", "Aube", "Nicolas","nicoaube@gmail.fr");
		 Administrateur admin2 = new Administrateur("netcad", "Cadenet", "Vincent","vincad-20@hotmail.fr");
		 Administrateur admin3 = new Administrateur("repas", "Repas", "Richard","richardrepas@gmail.fr");
		 
		 listAdmin.add(admin1);
		 listAdmin.add(admin2);
		 listAdmin.add(admin3);
	
		
		 for( int i =0; i < listAdmin.size(); i++ )
		 {  
			 assertEquals(listAdmin.get(i).getMdp(),AdministrateurDAO.getAdministrateur(listAdmin.get(i).getMail(),listAdmin.get(i).getMdp()).getMdp());
			 assertEquals(listAdmin.get(i).getNom(),AdministrateurDAO.getAdministrateur(listAdmin.get(i).getMail(),listAdmin.get(i).getMdp()).getNom());
			 assertEquals(listAdmin.get(i).getPrenom(),AdministrateurDAO.getAdministrateur(listAdmin.get(i).getMail(),listAdmin.get(i).getMdp()).getPrenom());
			 assertEquals(listAdmin.get(i).getMail(),AdministrateurDAO.getAdministrateur(listAdmin.get(i).getMail(),listAdmin.get(i).getMdp()).getMail());
		 }
	}
	
	
	
}
