package com.xworkz.ott.service;

import com.xworkz.ott.entity.OttEntity;

public interface OttService {
	
	public void save(OttEntity entity);
	
	public OttEntity findById(String email);
	
	public void update(OttEntity newentity,String email);
	
	public String deleteById(String email);

}
