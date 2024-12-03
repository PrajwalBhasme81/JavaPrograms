package com.xworkz.mobile.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MobileStoreUtil {

	public EntityManager getfactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		return factory.createEntityManager();

	}

}
