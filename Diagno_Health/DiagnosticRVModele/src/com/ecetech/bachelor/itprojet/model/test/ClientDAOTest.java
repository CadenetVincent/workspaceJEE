package com.ecetech.bachelor.itprojet.model.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.beans.Client;
import com.ecetech.bachelor.itprojet.model.dao.ClientDAO;

/**
 * @author Cadenet Vincent
 * 
 * @since Taha RIDENE
 *
 */

public class ClientDAOTest {

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
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#deleteClientByMail() }.
	 * @throws SQLException 
	 */
	

	@Test
	public void deleteClientByMailTest() 
	{
		int delete = 1;
		// VALEUR DE TEST
		
		//assertEquals(delete,ClientDAO.deleteClientByMail("chanvrette@gmail.fr"));
		
		//assertEquals(delete,ClientDAO.deleteClientByMail("lebreton@gmail.fr"));
		//assertEquals(delete,ClientDAO.deleteClientByMail("guigui@gmail.fr"));
		//assertEquals(delete,ClientDAO.deleteClientByMail("ludoviclaunay@gmail.fr"));
		//assertEquals(delete,ClientDAO.deleteClientByMail("jeandupond@gmail.com"));
	}
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#addClient() }.
	 * @throws SQLException 
	 */
	

	@Test
	public void addClientTest() 
	{
		int insert = 1;	
		
        // VALEUR DE TEST
		
		//assertEquals(insert,ClientDAO.addClient( "larue", 56, (float)60 , (float)1.49 , "Christine", "De-La-Rue-Chanvrette","chanvrette@gmail.fr"));
		
		//assertEquals(insert,ClientDAO.addClient( "lebreton", 80, (float)77 , (float)1.69 , "Charles", "Lebreton","lebreton@gmail.fr"));
		//assertEquals(insert,ClientDAO.addClient( "labarre", 21, (float)90 , (float)1.85 , "Guillaume", "Labarre","guigui@gmail.fr"));
		//assertEquals(insert,ClientDAO.addClient( "launay", 67, (float)67 , (float)1.72 , "Ludovic", "Launay","ludoviclaunay@gmail.fr"));
		//assertEquals(insert,ClientDAO.addClient( "ledupond", 18, (float)75.5 , (float)1.81 , "Jean", "Dupond","jeandupond@gmail.com"));
	}
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#updateCLientByMail() }.
	 * @throws SQLException 
	 */
	

	@Test
	public void updateClientByMailTest() 
	{
		int update = 1;	
		
		// VALEUR DE TEST
		
		//assertEquals(update,ClientDAO.updateClientByMail( "bellerue", 46, (float)58 , (float)1.45 , "Christiane", "Delarue-Chanvrette","chanvrette@gmail.fr"));
		
		//assertEquals(update,ClientDAO.updateClientByMail( "lebreton", 80, (float)77 , (float)1.69 , "Charles", "Lebreton","lebreton@gmail.fr"));
	    //assertEquals(update,ClientDAO.updateClientByMail( "labarre", 21, (float)90 , (float)1.85 , "Guillaume", "Labarre","guigui@gmail.fr"));
		//assertEquals(update,ClientDAO.updateClientByMail( "launay", 67, (float)67 , (float)1.72 , "Ludovic", "Launay","ludoviclaunay@gmail.fr"));
		//assertEquals(update,ClientDAO.updateClientByMail( "ledupond", 18, (float)75.5 , (float)1.81 , "Jean", "Dupond","jeandupond@gmail.com"));
	}

	

	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#getClient()}.
	 * @throws SQLException 
	 */
	

	@Test
	public void getClientTest() throws SQLException 
	{
		 
		 ArrayList<Client> listClient = new ArrayList<Client>();
		 
		 Client client1 = new Client( "lebreton", 80, (float)77 , (float)1.69 , "Charles", "Lebreton","lebreton@gmail.fr");
		 Client client2 = new Client( "labarre", 21, (float)90 , (float)1.85 , "Guillaume", "Labarre","guigui@gmail.fr");
		 Client client3 = new Client( "launay", 67, (float)67 , (float)1.72 , "Ludovic", "Launay","ludoviclaunay@gmail.fr");
		 Client client4 = new Client( "ledupond", 18, (float)75.5 , (float)1.81 , "Jean", "Dupond","jeandupond@gmail.com");
		 
		 

	     listClient.add(client1);
	     listClient.add(client2);
	     listClient.add(client3);
	     listClient.add(client4);
		
		 for( int i =0; i < listClient.size(); i++ )
		 {  

			 
			 assertEquals(listClient.get(i).getMdp(),ClientDAO.getClient(listClient.get(i).getMail(),listClient.get(i).getMdp()).getMdp());
			 assertEquals(listClient.get(i).getAge(),ClientDAO.getClient(listClient.get(i).getMail(),listClient.get(i).getMdp()).getAge());
			 assertEquals(Float.valueOf(listClient.get(i).getPoids()) ,  Float.valueOf(ClientDAO.getClient(listClient.get(i).getMail(),listClient.get(i).getMdp()).getPoids()));
			 assertEquals(Float.valueOf(listClient.get(i).getTaille()) , Float.valueOf(ClientDAO.getClient(listClient.get(i).getMail(),listClient.get(i).getMdp()).getTaille()));
			 assertEquals(listClient.get(i).getNom(),ClientDAO.getClient(listClient.get(i).getMail(),listClient.get(i).getMdp()).getNom());
			 assertEquals(listClient.get(i).getPrenom(),ClientDAO.getClient(listClient.get(i).getMail(),listClient.get(i).getMdp()).getPrenom());
			 assertEquals(listClient.get(i).getMail(),ClientDAO.getClient(listClient.get(i).getMail(),listClient.get(i).getMdp()).getMail());
			
		 }
	}
}
