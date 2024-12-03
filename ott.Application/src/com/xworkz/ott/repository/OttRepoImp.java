package com.xworkz.ott.repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.xworkz.ott.entity.OttEntity;
import com.xworkz.ott.util.OttUtil;

public class OttRepoImp implements OttRepo {

	OttUtil util = new OttUtil();
	@Override
	public void save(OttEntity entity) {
		EntityManager manager = util.getfactory();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
	}

	@Override
	public OttEntity findById(String email) {
		EntityManager manager = util.getfactory();
		
		return manager.find(OttEntity.class, email);
	}

	@Override
	public void update(OttEntity newentity, String email) {
		EntityManager manager = util.getfactory();
		
		OttEntity oldentity = findById(email);
		if(oldentity!=null) {
			manager.getTransaction().begin();
			oldentity.setName(newentity.getName());
			manager.merge(oldentity);
			manager.getTransaction().commit();
			manager.close();
		}
		
	}

	@Override
	public String deleteById(String email) {
		EntityManager manager = util.getfactory();
		
		if(manager.find(OttEntity.class, email)!=null) {
			manager.getTransaction().begin();
			manager.remove(manager.find(OttEntity.class, email));
			manager.getTransaction().commit();
			manager.close();
			return "Deleted Successfully";
		}
		return "Not Deleted";
		
	}

}
