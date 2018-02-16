package com.ecetech.bachelor.itprojet.model.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.dao.DiagnosticDAO;
import com.ecetech.bachelor.itprojet.model.beans.Diagnostic;

public class DiagnosticDAOTest {
	
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
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#deleteDiagnosticByName() }.
	 * @throws SQLException 
	 */
	
	
	@Test
	public void deleteDiagnosticByNameTest() 
	{
		int delete = 1;
		
		// VALEUR DE TEST
		
		//assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("section"));

//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("contraction"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("crampes"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("démangeaison"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("déviation cutané"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("enflement"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("impuissance"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("insensibilité"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("mal local"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("membre bloqué"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("picotement"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("rougeur"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("tiraillement"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("tremblement"));
//		assertEquals(delete,DiagnosticDAO.deleteDiagnosticByName("trouble psycho-moteur"));

		
	}
	
	
	@Test
	public void updateDiagnosticTest() {

		int update = 1;
		
		// VALEUR DE TEST
		
		//assertEquals(update,DiagnosticDAO.updateDiagnosticByName("section",8,"chute",37.1f,0));	

//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("contraction",8,"sport",37.9f,0));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("crampes",8,"inconnu",39.1f,0));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("démangeaison",7,"voyage étranger",38,1));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("déviation cutané",5,"inconnu",37.8f,0));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("enflement",8,"chute accidentelle",38.2f,1));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("impuissance",5,"insomnie",38.1f,1));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("insensibilité",5,"chute accidentelle",38.6f,1));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("mal local",9,"chute accidentelle",39.5f,1));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("membre bloqué",7,"faux mouvement",39.1f,1));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("picotement",8,"mauvais positionnement",37.3f,0));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("rougeur",5,"inconnu",39.1f,0));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("tiraillement",9,"inconnu",37.5f,0));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("tremblement",6,"sortie hivernale",38.6f,1));
//		assertEquals(update,DiagnosticDAO.updateDiagnosticByName("trouble psycho-moteur",7,"problémes personnels",39.6f,1));
	}
	

	@Test
	public void addDiagnosticTest() {
		int insert = 1;
		
		// VALEUR DE TEST
		
		//assertEquals(insert,DiagnosticDAO.addDiagnostic("section",7,"inconnu",38.1f,1));
		
//		assertEquals(insert,DiagnosticDAO.addDiagnostic("déchirure",8,"sport",37.9f,0));
//		assertEquals(insert,DiagnosticDAO.addDiagnostic("déchirure",8,"sport",37.9f,0));
//		assertEquals(insert,DiagnosticDAO.addDiagnostic("crampes",8,"inconnu",39.1f,0));

	}

	
	@Test
	public void getAllDiagnosticTest() throws SQLException 
	{
		/* 
		 ArrayList<Diagnostic> listDiagnostic = new ArrayList<Diagnostic>();
		 
		 Diagnostic diagnostic1 = new Diagnostic("contraction",8,"sport",37.9f,0);
		 Diagnostic diagnostic2 = new Diagnostic("crampes",8,"inconnu",39.1f,0);
		 Diagnostic diagnostic3 = new Diagnostic("démengeaison",7,"voyage étranger",38,1);
		 Diagnostic diagnostic4 = new Diagnostic("déviation cutané",5,"inconnu",37.8f,0);
		 Diagnostic diagnostic5 = new Diagnostic("enflement",8,"chute accidentelle",38.2f,1);
		 Diagnostic diagnostic6 = new Diagnostic("impuissance",5,"insomnie",38.1f,1);
		 Diagnostic diagnostic7 = new Diagnostic("insensibilité",5,"chute accidentelle",38.6f,1);
		 Diagnostic diagnostic8 = new Diagnostic("mal local",9,"chute accidentelle",39.5f,1);
		 Diagnostic diagnostic9 = new Diagnostic("membre bloqué",7,"faux mouvement",39.1f,1);
		 Diagnostic diagnostic10 = new Diagnostic("picotement",8,"mauvais positionnement",37.3f,0);
		 Diagnostic diagnostic11 = new Diagnostic("rougeur",5,"inconnu",39.1f,0);
		 Diagnostic diagnostic12 = new Diagnostic("tiraillement",9,"inconnu",37.5f,0);
		 Diagnostic diagnostic13 = new Diagnostic("tremblement",6,"sortie hivernale",38.6f,1);
		 Diagnostic diagnostic14 = new Diagnostic("trouble psycho-moteur",7,"problémes personnels",39.6f,1);

	
	    listDiagnostic.add(diagnostic1);
	    listDiagnostic.add(diagnostic2);
	    listDiagnostic.add(diagnostic3);
	    listDiagnostic.add(diagnostic4);
	    listDiagnostic.add(diagnostic5);
	    listDiagnostic.add(diagnostic6);
	    listDiagnostic.add(diagnostic7);
	    listDiagnostic.add(diagnostic8);
	    listDiagnostic.add(diagnostic9);
	    listDiagnostic.add(diagnostic10);
	    listDiagnostic.add(diagnostic11);
	    listDiagnostic.add(diagnostic12);
	    listDiagnostic.add(diagnostic13);
	    listDiagnostic.add(diagnostic14);

	    	    
		
		 for( int i =0; i < listDiagnostic.size(); i++ )
		 {  
			 assertEquals(listDiagnostic.get(i).getNom(),DiagnosticDAO.getAllDiagnostic().get(i).getNom());
			 assertEquals(listDiagnostic.get(i).getDouleur(),DiagnosticDAO.getAllDiagnostic().get(i).getDouleur());
			 assertEquals(listDiagnostic.get(i).getCause(),DiagnosticDAO.getAllDiagnostic().get(i).getCause());
			 assertEquals(listDiagnostic.get(i).getTemperature(),DiagnosticDAO.getAllDiagnostic().get(i).getTemperature(),0);
			 assertEquals(listDiagnostic.get(i).isFatigue(),DiagnosticDAO.getAllDiagnostic().get(i).isFatigue());
		 }
		 */
	}
	
}
