package com.ecetech.bachelor.itprojet.model.test;

import static org.junit.Assert.assertEquals;


import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecetech.bachelor.itprojet.model.beans.Avatar;
import com.ecetech.bachelor.itprojet.model.dao.AvatarDAO;

/**
 * @author Cadenet Vincent
 * 
 * @since Taha RIDENE
 *
 */

public class AvatarDAOTest {


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
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#deleteAvatarByCode() }.
	 * @throws SQLException 
	 */
	
	@Test
	public void deleteAvatarByCodeTest() 
	{
		int delete = 1;
		
		//VALEUR DE TEST
		
		//assertEquals(delete,AvatarDAO.deleteAvatarByCode("AAAZ27"));
		
		//assertEquals(delete,AvatarDAO.deleteAvatarByCode("AAAZ21"));
		//assertEquals(delete,AvatarDAO.deleteAvatarByCode("AAAZ23"));
		//assertEquals(delete,AvatarDAO.deleteAvatarByCode("AAAZ24"));
		//assertEquals(delete,AvatarDAO.deleteAvatarByCode("AAAZ26"));
	}
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#addAvatar() }.
	 * @throws SQLException 
	 */
	
	@Test
	public void addAvatarTest() 
	{
		int insert = 1;	
		
		//VALEUR DE TEST
		
		//assertEquals(insert,AvatarDAO.addAvatar( "AAAZ27","00:02:20", "épaule gauche","./Mes_Avatars/Avatar5.mp4"));
				
		//assertEquals(insert,AvatarDAO.addAvatar( "AAAZ21","00:02:30", "bras droit","./Mes_Avatars/Avatar.mp4"));
		//assertEquals(insert,AvatarDAO.addAvatar( "AAAZ23","00:02:41", "bras gauche","./Mes_Avatars/Avatar1.mp4"));
		//assertEquals(insert,AvatarDAO.addAvatar( "AAAZ24","00:03:17", "jambe droite","./Mes_Avatars/Avatar2.mp4"));
		//assertEquals(insert,AvatarDAO.addAvatar( "AAAZ26","00:02:35", "épaule droite","./Mes_Avatars/Avatar4.mp4"));
	}
	
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#updateAvatarByCode() }.
	 * @throws SQLException 
	 */
	
	@Test
	public void updateAvatarByCodeTest() 
	{
		int update = 1;	
		
		//VALEUR DE TEST
		
		//assertEquals(update,AvatarDAO.updateAvatarByCode( "AAAZ27","00:01:30", "bras droit","./Mes_Avatars/Avatar6.mp4"));
		
		//assertEquals(update,AvatarDAO.updateAvatarByCode( "AAAZ21","00:02:30", "bras droit","./Mes_Avatars/Avatar.mp4"));
		//assertEquals(update,AvatarDAO.updateAvatarByCode( "AAAZ23","00:02:41", "bras gauche","./Mes_Avatars/Avatar1.mp4"));
		//assertEquals(update,AvatarDAO.updateAvatarByCode( "AAAZ24","00:03:17", "jambe droite","./Mes_Avatars/Avatar2.mp4"));
		//assertEquals(update,AvatarDAO.updateAvatarByCode( "AAAZ26","00:02:35", "épaule droite","./Mes_Avatars/Avatar4.mp4"));
	}

	
	
	/**
	 * Test method for {@link com.ecetech.bachelor.itprojet.model.dao#getAvatar()}.
	 * @throws SQLException 
	 */
	@Test
	public void getAvatarTest() throws SQLException 
	{
		 
		 ArrayList<Avatar> listAvatar = new ArrayList<Avatar>();
		 
		 Avatar avatar1 = new Avatar( "AAAZ21","00:02:30", "bras droit","./Mes_Avatars/Avatar.mp4");
		 Avatar avatar2 = new Avatar( "AAAZ23","00:02:41", "bras gauche","./Mes_Avatars/Avatar1.mp4");
		 Avatar avatar3 = new Avatar( "AAAZ24","00:03:17", "jambe droite","./Mes_Avatars/Avatar2.mp4");
		 Avatar avatar4 = new Avatar( "AAAZ25","00:02:05", "jambe gauche","./Mes_Avatars/Avatar3.mp4");
		 Avatar avatar5 = new Avatar( "AAAZ26","00:02:35", "épaule droite","./Mes_Avatars/Avatar4.mp4");
		 
		 listAvatar.add(avatar1);
		 listAvatar.add(avatar2);
		 listAvatar.add(avatar3);
		 listAvatar.add(avatar4);
		 listAvatar.add(avatar5);
		 
	    
		
		 for( int i =0; i < listAvatar.size(); i++ )
		 {  

			 
			 assertEquals(listAvatar.get(i).getCode(),AvatarDAO.getAvatar(listAvatar.get(i).getCode()).getCode());
			 assertEquals(listAvatar.get(i).getDuree(),AvatarDAO.getAvatar(listAvatar.get(i).getCode()).getDuree());
			 assertEquals(listAvatar.get(i).getCategorie(),AvatarDAO.getAvatar(listAvatar.get(i).getCode()).getCategorie());
			 assertEquals(listAvatar.get(i).getLienMetrage(),AvatarDAO.getAvatar(listAvatar.get(i).getCode()).getLienMetrage());

			
		 }
	}
}
