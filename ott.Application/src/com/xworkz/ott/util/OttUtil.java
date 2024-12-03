package com.xworkz.ott.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OttUtil {
	
	public EntityManager getfactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		return factory.createEntityManager();
	}

}
