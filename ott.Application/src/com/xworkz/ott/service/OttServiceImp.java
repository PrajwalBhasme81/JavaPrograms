package com.xworkz.ott.service;

import com.xworkz.ott.entity.OttEntity;
import com.xworkz.ott.repository.OttRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OttServiceImp implements OttService{

	private OttRepo repo;
	@Override
	public void save(OttEntity entity) {
		if(entity!=null) {
			repo.save(entity);
			System.out.println("Data is Saved");
		}
		else {
			System.out.println("Data is Not Saved");
		}
			
	}

	@Override
	public OttEntity findById(String email) {
		
		return repo.findById(email);
	}

	@Override
	public void update(OttEntity newentity, String email) {
		repo.update(newentity, email);
		System.out.println("Update Successfully");
		
	}

	@Override
	public String deleteById(String email) {
		
		return repo.deleteById(email);
		
	}

	

}
