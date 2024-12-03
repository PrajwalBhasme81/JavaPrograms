package com.xworkz.ad.reporisitory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xworkz.ad.dto.AdAgencyDto;
import com.xworkz.ad.entity.AdAgencyEntity;
import com.xworkz.ad.util.AdAgencyUtil;

public class AdAgencyRepoImp implements AdAgencyRepo {

	AdAgencyUtil util = new AdAgencyUtil();

	@Override
	public AdAgencyDto save(AdAgencyEntity entity) {
		EntityManager manager = util.getManager();

		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

		return new AdAgencyDto();
	}

	@Override
	public List<AdAgencyEntity> findAll() {
		EntityManager manager = util.getManager();
		TypedQuery<AdAgencyEntity> query = manager.createNamedQuery("findAll", AdAgencyEntity.class);
		return query.getResultList();
	}

	@Override
	public AdAgencyEntity findByUsernameAndPassword(String email, String password) {
		EntityManager manager = util.getManager();
        
		TypedQuery<AdAgencyEntity> typedQuery = manager.createNamedQuery("authentication", AdAgencyEntity.class);
        typedQuery.setParameter("email", email);
        typedQuery.setParameter("password", password);

       
        try {
          return typedQuery.getSingleResult();
        } catch (Exception e) {
       return  new AdAgencyEntity();
    }

	}
}
