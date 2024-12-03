package com.xworkz.ott.repository;

import com.xworkz.ott.entity.OttEntity;

public interface OttRepo {

	public void save(OttEntity entity);

	public OttEntity findById(String email);

	public void update(OttEntity newentity,String email);
	
	String deleteById(String email);

}
