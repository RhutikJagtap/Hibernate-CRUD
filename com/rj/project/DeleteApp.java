package com.rj.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rj.entities.Song;

public class DeleteApp 
{
	public static void main( String[] args )
    {
    	SessionFactory sessionFactory = getFactory();
    	
    	//Initialize the session object
    	Session session=sessionFactory.openSession();
    	
        //load object that is i want to delete
    	Song song=session.get(Song.class, 1);
    	
    	session.beginTransaction();
    	session.delete(song);
    	session.getTransaction().commit();
    	
    	System.out.println("Song deleted.......");
    }
  
}
//for deleting data  first load data by using get() or load() method
//beginTransaction is  required
//delete method is using delete() method
//getTransaction().commit is required
