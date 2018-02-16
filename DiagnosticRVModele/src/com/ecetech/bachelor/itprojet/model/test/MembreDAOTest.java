package com.ecetech.bachelor.itprojet.model.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.beans.Membre;
import com.ecetech.bachelor.itprojet.model.dao.MembreDAO;

public class MembreDAOTest {
	
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


	@Test
	public void deleteMembreByNameTest() 
	{
		int delete = 1;
		
		//VALEUR DE TEST 
		
		//assertEquals(delete,MembreDAO.deleteMembreByName("clavicule droite"));
		
//		assertEquals(delete,MembreDAO.deleteMembreByName("avant-bras droit"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("avant-bras gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("bras droit"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("bras gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("coude droit"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("coude gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("cuisse droite"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("cuisse gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("épaule droite"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("épaule gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("genoux droit"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("genoux gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("main droite"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("main gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("mollet droit"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("mollet gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("pied droit"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("pied gauche"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("tibia droit"));
//		assertEquals(delete,MembreDAO.deleteMembreByName("tibia gauche"));

		
	} 
	
	
	@Test
	public void addMembreTest() 
	{
		int insert = 1;
		
		//VALEUR DE TEST
		
		//assertEquals(insert,MembreDAO.addMembre("clavicule droite","superieur gauche"));
		
		//assertEquals(insert,MembreDAO.addMembre("tibia droit","inferieur droit"));
		//assertEquals(insert,MembreDAO.addMembre("tibia gauche","inferieur gauche"));
		//assertEquals(insert,MembreDAO.addMembre("genoux droit","inferieur droit"));
		//assertEquals(insert,MembreDAO.addMembre("genoux gauche","inferieur gauche"));
	}
	

	@Test
	public void updateMembreTest() {

		int update = 1;
		
		//VALEUR DE TEST
		
		//assertEquals(update,MembreDAO.updateMembreByName("clavicule droite","superieur droit"));
		
		//assertEquals(update,MembreDAO.updateMembreByName("avant-bras droit","superieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("avant-bras gauche","superieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("bras droit","superieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("bras gauche","superieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("coude droit","superieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("coude gauche","superieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("cuisse droite","inferieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("cuisse gauche","inferieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("épaule droite","superieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("épaule gauche","superieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("genoux droit","inferieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("genoux gauche","inferieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("main droite","superieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("main gauche","superieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("mollet droit","inferieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("mollet gauche","inferieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("pied droit","inferieur droit"));
		//assertEquals(update,MembreDAO.updateMembreByName("pied gauche","inferieur gauche"));
		//assertEquals(update,MembreDAO.updateMembreByName("tibia droit","inferieur droit"));
	}

	@Test
	public void getAllMembreTest() throws SQLException 
	{
		 
		 ArrayList<Membre> listMembre = new ArrayList<Membre>();
		 
		 Membre membre1 = new Membre("avant-bras droit","superieur droit");
		 Membre membre2 = new Membre("avant-bras gauche","superieur gauche");
		 Membre membre3 = new Membre("bras droit","superieur droit");
		 Membre membre4 = new Membre("bras gauche","superieur gauche");
		 Membre membre5 = new Membre("coude droit","superieur droit");
		 Membre membre6 = new Membre("coude gauche","superieur gauche");
		 Membre membre7 = new Membre("cuisse droite","inferieur droit");
		 Membre membre8 = new Membre("cuisse gauche","inferieur gauche");
		 Membre membre9 = new Membre("épaule droite","superieur droit");
		 Membre membre10 = new Membre("épaule gauche","superieur gauche");
		 Membre membre11 = new Membre("genoux droit","inferieur droit");
		 Membre membre12 = new Membre("genoux gauche","inferieur gauche");
		 Membre membre13 = new Membre("main droite","superieur droit");
		 Membre membre14 = new Membre("main gauche","superieur gauche");
		 Membre membre15 = new Membre("mollet droit","inferieur droit");
		 Membre membre16 = new Membre("mollet gauche","inferieur gauche");
		 Membre membre17 = new Membre("pied droit","inferieur droit");
		 Membre membre18 = new Membre("pied gauche","inferieur gauche");
		 Membre membre19 = new Membre("tibia droit","inferieur droit");
		 Membre membre20 = new Membre("tibia gauche","inferieur gauche");

	
	    listMembre.add(membre1);
	    listMembre.add(membre2);
	    listMembre.add(membre3);
	    listMembre.add(membre4);
	    listMembre.add(membre5);
	    listMembre.add(membre6);
	    listMembre.add(membre7);
	    listMembre.add(membre8);
	    listMembre.add(membre9);
	    listMembre.add(membre10);
	    listMembre.add(membre11);
	    listMembre.add(membre12);
	    listMembre.add(membre13);
	    listMembre.add(membre14);
	    listMembre.add(membre15);
	    listMembre.add(membre16);
	    listMembre.add(membre17);
	    listMembre.add(membre18);
	    listMembre.add(membre19);
	    listMembre.add(membre20);
	    	    
		
		 for( int i =0; i < listMembre.size(); i++ )
		 {  
			 assertEquals(listMembre.get(i).getNom(),MembreDAO.getAllMembre().get(i).getNom());
			 assertEquals(listMembre.get(i).getCategorieMembre(),MembreDAO.getAllMembre().get(i).getCategorieMembre());
		 }
	}

	
	

}
