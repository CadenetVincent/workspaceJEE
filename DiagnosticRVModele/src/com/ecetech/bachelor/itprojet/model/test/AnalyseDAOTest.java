package com.ecetech.bachelor.itprojet.model.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.beans.Analyse;
import com.ecetech.bachelor.itprojet.model.dao.AnalyseDAO;

/**
 * @author Cadenet Vincent
 * 
 * @since Taha RIDENE
 *
 */

public class AnalyseDAOTest {

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
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#deleteAnalyseByCode() }.
	 * @throws SQLException 
	 */
	
	@Test
	public void deleteAnalyseByCodeTest() 
	{
		int delete = 1;
		
		//VALEUR DE TEST
		
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA12"));
		
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA01"));
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA02"));
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA03"));
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA04"));
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA05"));
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA06"));
		//assertEquals(delete,AnalyseDAO.deleteAnalyseByCode("AAA07"));
	    
	}
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#addAnalyse() }.
	 * @throws SQLException 
	 */
	

	@Test
	public void addAnalyseTest() 
	{
		int insert = 1;	
		
		//VALEUR DE TEST
		
		//assertEquals(insert,AnalyseDAO.addAnalyse( 17,"00:03:23", "AAA12",70,"Compression nerveuse",1244));
		
		//assertEquals(insert,AnalyseDAO.addAnalyse( 32,"00:01:02", "AAA02",17,"Calcification des tendons",1243));
		//assertEquals(insert,AnalyseDAO.addAnalyse( 12,"00:00:32", "AAA03",34,"Compression nerveuse",1242));
		//assertEquals(insert,AnalyseDAO.addAnalyse( 31,"00:00:59", "AAA07",17,"Luxation acromio-claviculaire",1238));
	}


	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#getAllAnalyse()}.
	 * @throws SQLException 
	 */
	@Test
	public void getAllAnalyseTest() throws SQLException 
	{
		 
		 ArrayList<Analyse> listAnalyse = new ArrayList<Analyse>();
		 
		 Analyse analyse1 = new Analyse( 20,"00:01:23", "AAA01",32,"Arthrose",1244);
		 Analyse analyse2 = new Analyse( 32,"00:01:02", "AAA02",17,"Calcification des tendons",1243);
		 Analyse analyse3 = new Analyse( 12,"00:00:32", "AAA03",34,"Compression nerveuse",1242);
		 Analyse analyse4 = new Analyse( 31,"00:00:49", "AAA04",15,"Fracture",1241);
		 Analyse analyse5 = new Analyse( 9,"00:01:51", "AAA05",11,"Lésion SLAP",1240);
		 Analyse analyse6 = new Analyse( 27,"00:01:01", "AAA06",12,"Lésion-osseuse",1239);
		 Analyse analyse7 = new Analyse( 31,"00:00:59", "AAA07",17,"Luxation acromio-claviculaire",1238);
		 Analyse analyse8 = new Analyse( 15,"00:00:47", "AAA08",24,"Luxation épaule",1237);
		 Analyse analyse9 = new Analyse( 8,"00:00:20", "AAA09",23,"Ostéoporose",1236);
		 Analyse analyse10 = new Analyse( 10,"00:02:01", "AAA10",21,"Rupture de la coiffe",1235);
		 Analyse analyse11 = new Analyse( 23,"00:02:11", "AAA11",9,"Scoliose",1234);

	
		 listAnalyse.add(analyse1);
		 listAnalyse.add(analyse2);
		 listAnalyse.add(analyse3);
		 listAnalyse.add(analyse4);
		 listAnalyse.add(analyse5);
		 listAnalyse.add(analyse6);
		 listAnalyse.add(analyse7);
		 listAnalyse.add(analyse8);
		 listAnalyse.add(analyse9);
		 listAnalyse.add(analyse10);
		 listAnalyse.add(analyse11);
	
	    
		
		 for( int i =0; i < listAnalyse.size(); i++ )
		 {  
			 
			 assertEquals(listAnalyse.get(i).getComparaisonPositionX(),AnalyseDAO.getAnalyse(listAnalyse.get(i).getCode()).getComparaisonPositionX());
			 assertEquals(listAnalyse.get(i).getComparaisonPositionY(),AnalyseDAO.getAnalyse(listAnalyse.get(i).getCode()).getComparaisonPositionY());
			 assertEquals(listAnalyse.get(i).getCode(),AnalyseDAO.getAnalyse(listAnalyse.get(i).getCode()).getCode());
			 assertEquals(listAnalyse.get(i).getComparaisonDuree(),AnalyseDAO.getAnalyse(listAnalyse.get(i).getCode()).getComparaisonDuree());
			 assertEquals(listAnalyse.get(i).getNom(),AnalyseDAO.getAnalyse(listAnalyse.get(i).getCode()).getNom());
			 assertEquals(listAnalyse.get(i).getCodeMouvement(),AnalyseDAO.getAnalyse(listAnalyse.get(i).getCode()).getCodeMouvement());
			
		 }
	}
}
