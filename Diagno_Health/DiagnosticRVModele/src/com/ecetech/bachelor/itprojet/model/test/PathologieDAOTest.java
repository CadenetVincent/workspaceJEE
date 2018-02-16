package com.ecetech.bachelor.itprojet.model.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.beans.Pathologie;
import com.ecetech.bachelor.itprojet.model.dao.PathologieDAO;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Cadenet Vincent
 * 
 * @since Taha RIDENE
 *
 */
public class PathologieDAOTest {

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
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#deletePathologieByName() }.
	 * @throws SQLException 
	 */
	
	@Test
	public void deletePathologieByNameTest() 
	{
		int delete = 1;
		
		//VALEUR DE TEST 
		
		//assertEquals(delete,PathologieDAO.deletePathologieByName("h�matome"));
		
		//assertEquals(delete,PathologieDAO.deletePathologieByName("Arthrose"));
		//assertEquals(delete,PathologieDAO.deletePathologieByName("Calcification des tendons"));
		//assertEquals(delete,PathologieDAO.deletePathologieByName("L�sion SLAP"));
		//assertEquals(delete,PathologieDAO.deletePathologieByName("rupture nerveuse"));
		//assertEquals(delete,PathologieDAO.deletePathologieByName("phl�bite"));
		//assertEquals(delete,PathologieDAO.deletePathologieByName("Luxation �paule"));
	}
	
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#updatePathologieByName() }.
	 * @throws SQLException 
	 */
	
	@Test
	public void updatePathologieByNameTest() 
	{
		int update = 1;
		
		//VALEUR DE TEST 
		
		//assertEquals(update,PathologieDAO.updatePathologieByName("h�matome", 8, "antibiotique","pas de sport","AAA16"));
		
		//assertEquals(update,PathologieDAO.updatePathologieByName("Arthrose", 7, "anti-inflamatoire","repos","AAA08"));
		//assertEquals(update,PathologieDAO.updatePathologieByName("Calcification des tendons", 6, "kin�sith�rapie","immobilisation","AAA06"));
		//assertEquals(update,PathologieDAO.updatePathologieByName("L�sion SLAP", 8, "kin�sith�rapie","interdit de conduire","AAA09"));
		//assertEquals(update,PathologieDAO.updatePathologieByName("rupture nerveuse", 5, "attelle","immobilisation","AAA03"));
		//assertEquals(update,PathologieDAO.updatePathologieByName("phl�bite", 7, "antibiotique","repos","AAA14")); 
	}
	
	
	
	
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#addPathologie() }.
	 * @throws SQLException 
	 */

	
	@Test
	public void addPathologieTest() 
	{
		int insert = 1;
		
		//VALEUR DE TEST 
		
		//assertEquals(insert,PathologieDAO.addPathologie("h�matome", 6, "anti-inflamatoire","repos","AAA16"));
		
		//assertEquals(insert,PathologieDAO.addPathologie("Arthrose", 7, "anti-inflamatoire","repos","AAA08"));
		//assertEquals(insert,PathologieDAO.addPathologie("Calcification des tendons", 6, "kin�sith�rapie","immobilisation","AAA06"));
		//assertEquals(insert,PathologieDAO.addPathologie("L�sion SLAP", 8, "kin�sith�rapie","interdit de conduire","AAA09"));
		//assertEquals(insert,PathologieDAO.addPathologie("rupture nerveuse", 5, "attelle","immobilisation","AAA03"));
		//assertEquals(insert,PathologieDAO.addPathologie("phl�bite", 7, "antibiotique","repos","AAA14")); 	
	}


	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#getAllPathologie()}.
	 * @throws SQLException 
	 */
	@Test
	public void getAllPathologieTest() throws SQLException 
	{
		 
		 ArrayList<Pathologie> listPath = new ArrayList<Pathologie>();
		 
		 Pathologie path1 = new Pathologie("Arthrose", 7, "anti-inflamatoire","repos","AAA08");
		 Pathologie path2 = new Pathologie("Calcification des tendons", 6, "kin�sith�rapie","immobilisation","AAA06");
		 Pathologie path3 = new Pathologie("Compression nerveuse", 8, "attelle","pas de sport","AAA12");
		 Pathologie path4 = new Pathologie("entorse",8,"attelle","r�education","AAA15");
		 Pathologie path5 = new Pathologie("Fracture", 8, "attelle","immobilisation","AAA03");
		 Pathologie path6 = new Pathologie("L�sion SLAP", 8, "kin�sith�rapie","interdit de conduire","AAA09");
		 Pathologie path7 = new Pathologie("L�sion-osseuse", 8, "anti-inflamatoire","repos","AAA01");
		 Pathologie path8 = new Pathologie("Luxation acromio-claviculaire", 7, "kin�sith�rapie","immobilisation","AAA10");
		 Pathologie path9 = new Pathologie("Luxation �paule", 7, "kin�sith�rapie","repos","AAA07");
		 Pathologie path10 = new Pathologie("Ost�oporose", 7, "attelle","pas de sport","AAA02");
		 Pathologie path11 = new Pathologie("phl�bite", 7, "antibiotique","repos","AAA14");
		 Pathologie path12 = new Pathologie("Rupture de la coiffe", 8, "anti-inflamatoire","interdit de conduire","AAA04");
		 Pathologie path13 = new Pathologie("rupture nerveuse", 5, "attelle","immobilisation","AAA03");
		 Pathologie path14 = new Pathologie("Scoliose", 7, "anti-inflamatoire","pas de sport","AAA13");
		 Pathologie path15 = new Pathologie("Tendinite de la coiffe", 7, "kin�sith�rapie","repos","AAA05");
		 Pathologie path16 = new Pathologie("Tendinite du coude", 6, "anti-inflamatoire","pas de sport","AAA11");
	
	    listPath.add(path1);
	    listPath.add(path2);
	    listPath.add(path3);
	    listPath.add(path4);
	    listPath.add(path5);
	    listPath.add(path6);
	    listPath.add(path7);
	    listPath.add(path8);
	    listPath.add(path9);
	    listPath.add(path10);
	    listPath.add(path11);
	    listPath.add(path12);
	    listPath.add(path13);
	    listPath.add(path14);
	    listPath.add(path15);
	    listPath.add(path16);
	    
		
		 for( int i =0; i < listPath.size(); i++ )
		 {  
			 assertEquals(listPath.get(i).getNom(),PathologieDAO.getAllPathologie().get(i).getNom());
			 assertEquals(listPath.get(i).getNiveau_urgence(),PathologieDAO.getAllPathologie().get(i).getNiveau_urgence());
			 assertEquals(listPath.get(i).getTraitement(),PathologieDAO.getAllPathologie().get(i).getTraitement());
			 assertEquals(listPath.get(i).getConseil(),PathologieDAO.getAllPathologie().get(i).getConseil());
			 assertEquals(listPath.get(i).getCodeAnalyse(),PathologieDAO.getAllPathologie().get(i).getCodeAnalyse());
			
		 }
	}
}
