
package com.seleniumexpress.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.seleniumexpress.entities.Song;
import com.seleniumexpress.util.HibernateUtils;


public class CreateApp 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    	
    	//Initialize the session object
    	Session session=sessionFactory.openSession();
    	
    	Song song1=new Song();
    	song1.setId(1);
    	song1.setSongName("Rim zim gire savan");
    	song1.setArtist("Kishore Kumar");
    	
    	Song song2=new Song();
    	song2.setId(2);
    	song2.setSongName("Pehele Bhi mein");
    	song2.setArtist("Sonu nigam");
    	
    	
    	session.beginTransaction();
    	session.save(song1);
    	session.save(song2);
    	session.getTransaction().commit();;
    	
    	//For Third song 
    	Session session1=sessionFactory.openSession();
    
    	session1.beginTransaction();
    	session1.save(new Song(3,"Man Mast magan","Arjit Singh"));
    	session1.getTransaction().commit();
    	
    	System.out.println("Song saved......check db..");
    	
    	session.close();
    }


}

