package com.xworkz.ad.service;

import java.util.List;

import com.xworkz.ad.dto.AdAgencyDto;

public interface AdAgencyService {
	
	public void save(AdAgencyDto dto);
	
	List<AdAgencyDto> findAll(); 
	
	boolean findByUsernameAndPassword(String email, String password);

}
