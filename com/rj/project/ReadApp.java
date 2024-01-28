package com.rj.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rj.entities.Song;
import com.rj.util.HibernateUtils;

public class ReadApp 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    	
    	//Initialize the session object
    	Session session=sessionFactory.openSession();
    	
    	//fetch data
    	Song song=session.get(Song.class, 2);
    	
    	System.out.println(song);
    }


}

