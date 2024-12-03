package com.xworkz.ad.reporisitory;

import java.util.List;

import com.xworkz.ad.dto.AdAgencyDto;
import com.xworkz.ad.entity.AdAgencyEntity;

public interface AdAgencyRepo {
	
	public AdAgencyDto save(AdAgencyEntity entity);
	
	List<AdAgencyEntity> findAll();
	
	public AdAgencyEntity findByUsernameAndPassword(String email, String password);


}
