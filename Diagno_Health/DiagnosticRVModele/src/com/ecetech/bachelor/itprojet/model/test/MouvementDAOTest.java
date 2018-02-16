package com.ecetech.bachelor.itprojet.model.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.beans.Mouvement;
import com.ecetech.bachelor.itprojet.model.dao.MouvementDAO;



public class MouvementDAOTest {

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
	public void deleteMouvementByCodeTest() 
	{
		int delete = 1;
		//VALEUR DE TEST 
		
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1245));
		
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1234));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1235));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1236));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1237));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1238));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1239));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1240));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1241));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1242));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1243));
		//assertEquals(delete,MouvementDAO.deleteMouvementByCode(1244));

	
	} 


	@Test
	public void addMouvementTest() {

		int insert = 1;
		
		//VALEUR DE TEST 
		
		//assertEquals(insert,MouvementDAO.addMouvement(37,22,1245,"00:01:54",23,9));
		
		//assertEquals(insert,MouvementDAO.addMouvement(42,9,1245,"00:02:01",40,12));
		//assertEquals(insert,MouvementDAO.addMouvement(22,19,1246,"00:01:21",30,18));
		//assertEquals(insert,MouvementDAO.addMouvement(37,51,1247,"00:00:32",0,0));
	}
	
	
	@Test
	public void getAllMouvementTest() throws SQLException 
	{
		 
		 ArrayList<Mouvement> listMouvement = new ArrayList<Mouvement>();
		 
		 Mouvement mouvement1 = new Mouvement(20,11,1234,"00:03:01",17,15);
		 Mouvement mouvement2 = new Mouvement(43,53,1235,"00:02:23",45,50);
		 Mouvement mouvement3 = new Mouvement(7,43,1236,"00:01:23",10,60);
		 Mouvement mouvement4 = new Mouvement(18,34,1237,"00:00:20",22,40);
		 Mouvement mouvement5 = new Mouvement(14,15,1238,"00:03:23",70,12);
		 Mouvement mouvement6 = new Mouvement(34,20,1239,"00:00:32",21,17);
		 Mouvement mouvement7 = new Mouvement(20,30,1240,"00:01:34",30,25);
		 Mouvement mouvement8 = new Mouvement(12,41,1241,"00:02:10",34,23);
		 Mouvement mouvement9 = new Mouvement(50,23,1242,"00:00:44",21,32);
		 Mouvement mouvement10 = new Mouvement(31,29,1243,"00:02:01",19,41);
		 Mouvement mouvement11 = new Mouvement(27,41,1244,"00:01:07",13,50);

	    listMouvement.add(mouvement1);
	    listMouvement.add(mouvement2);
	    listMouvement.add(mouvement3);
	    listMouvement.add(mouvement4);
	    listMouvement.add(mouvement5);
	    listMouvement.add(mouvement6);
	    listMouvement.add(mouvement7);
	    listMouvement.add(mouvement8);
	    listMouvement.add(mouvement9);
	    listMouvement.add(mouvement10);
	    listMouvement.add(mouvement11);
	    	    
		
		 for( int i =0; i < listMouvement.size(); i++ )
		 {  
			 assertEquals(listMouvement.get(i).getCoordonneeX(),MouvementDAO.getAllMouvement().get(i).getCoordonneeX());
			 assertEquals(listMouvement.get(i).getCoordonneeY(),MouvementDAO.getAllMouvement().get(i).getCoordonneeY());
			 assertEquals(listMouvement.get(i).getCode(),MouvementDAO.getAllMouvement().get(i).getCode());
			 assertEquals(listMouvement.get(i).getTempsT(),MouvementDAO.getAllMouvement().get(i).getTempsT());
			 assertEquals(listMouvement.get(i).getOrigineX(),MouvementDAO.getAllMouvement().get(i).getOrigineX());
			 assertEquals(listMouvement.get(i).getOrigineY(),MouvementDAO.getAllMouvement().get(i).getOrigineY());
		 }
	}
	
	
	
	
}
