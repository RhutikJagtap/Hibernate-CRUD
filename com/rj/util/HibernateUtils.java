package com.rj.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rj.entities.Song;

public class HibernateUtils {
  
	//method is public so availabele anywhere
	public static SessionFactory getSessionFactory() {
		//create Configuration
    	Configuration configuration=new Configuration();
    	configuration.configure(); //it will load hibernate.cfg.xml
    	
    	configuration.addAnnotatedClass(Song.class);
    	
    	//create sessionfactory
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
		return sessionFactory;
	}
}

