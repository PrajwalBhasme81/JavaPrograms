package com.xworkz.ad.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.ad.dto.AdAgencyDto;
import com.xworkz.ad.entity.AdAgencyEntity;

public class AdAgencyUtil {
	
	public AdAgencyUtil() {
		
	}

	public EntityManager getManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		return factory.createEntityManager();
	}

	public static AdAgencyEntity mapDtoToEntity(AdAgencyDto dto) {

		AdAgencyEntity entity = new AdAgencyEntity();
		if (dto != null) {
			entity.setPersonName(dto.getPersonName());
			entity.setCompanyName(dto.getCompanyName());
			entity.setEmail(dto.getEmail());
			entity.setPassword(dto.getPassword());
			entity.setContact(dto.getContact());
			entity.setProductName(dto.getProductName());
			entity.setDescription(dto.getDescription());
		}
		return entity;

	}

	public static AdAgencyDto mapEntityToDto(AdAgencyEntity entity) {

		AdAgencyDto dto = new AdAgencyDto();
		if (entity != null) {
			dto.setId(entity.getId());
			dto.setPersonName(entity.getPersonName());
			dto.setCompanyName(entity.getCompanyName());
			dto.setEmail(entity.getEmail());
			dto.setPassword(entity.getPassword());
			dto.setContact(entity.getContact());
			dto.setProductName(entity.getProductName());
			dto.setDescription(entity.getDescription());
		}
		return dto;

	}

}
