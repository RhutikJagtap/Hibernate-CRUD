package com.rj.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rj.entities.Song;
import com.rj.util.HibernateUtils;

public class UpdateApp 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    	
    	//Initialize the session object
    	Session session=sessionFactory.openSession();
    	
    	//load first data
    	Song song=session.load(Song.class,3);
    	
    	song.setId(3);
    	song.setSongName("Kal ho na ho");
    	song.setArtist("sonu");
    	
    	session.beginTransaction();
    	session.update(song);
    	session.getTransaction().commit();
    	
    	System.out.println("Song updated.......");
    }


}

//for updating data  first load data
//beginTransaction is  required
//update method is their for updating data
//getTransaction().coomit is required
