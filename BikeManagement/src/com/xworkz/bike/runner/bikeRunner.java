package com.xworkz.bike.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.bike.entity.bikeEntity;

public class bikeRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("Factory:"+factory);
		
		EntityManager manager = factory.createEntityManager();
		bikeEntity entity =new bikeEntity();
		entity.setName("RoyalEnfield");
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

	}

}
