package com.xworkz.mobile.service;

import com.xworkz.mobile.dto.MobileStoreDto;
import com.xworkz.mobile.entity.MobileStoreEntity;
import com.xworkz.mobile.repository.MobileStoreRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MobileStoreServiceImp implements MobileStoreService {

	private MobileStoreRepo repo;
	
	@Override
	public String save(MobileStoreDto dto) {
		MobileStoreEntity entity = new MobileStoreEntity();
		entity.setBrand(dto.getBrand());
		entity.setRam(dto.getRam());
		entity.setStorage(dto.getStorage());
		entity.setWarranty(dto.getWarranty());
		entity.setPrice(dto.getPrice());
		repo.save(entity);
		return "Saved Successfully";
		
		
	}

}
