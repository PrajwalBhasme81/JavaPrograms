package com.xworkz.mobile.repository;

import javax.persistence.EntityManager;

import com.xworkz.mobile.dto.MobileStoreDto;
import com.xworkz.mobile.entity.MobileStoreEntity;
import com.xworkz.mobile.util.MobileStoreUtil;

public class MobileStoreRepoImp implements MobileStoreRepo{

	MobileStoreUtil util = new MobileStoreUtil();
	@Override
	public void save(MobileStoreEntity entity) {
		EntityManager manager = util.getfactory();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		
	}
	

}
