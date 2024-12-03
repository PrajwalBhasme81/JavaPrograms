package com.xworkz.ad.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.ad.dto.AdAgencyDto;
import com.xworkz.ad.entity.AdAgencyEntity;
import com.xworkz.ad.reporisitory.AdAgencyRepo;
import com.xworkz.ad.util.AdAgencyUtil;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class AdAgencyServiceImp implements AdAgencyService {
	private AdAgencyRepo repo;
	@Override
	public void save(AdAgencyDto dto) {
		AdAgencyEntity entity = AdAgencyUtil.mapDtoToEntity(dto);
		repo.save(entity);
	}
	
	@Override
	public List<AdAgencyDto> findAll() {
		List<AdAgencyEntity> entity = repo.findAll();
		return entity.stream().map(AdAgencyUtil::mapEntityToDto).collect(Collectors.toList());
	}

	@Override
	 public boolean findByUsernameAndPassword(String email, String password) {
		AdAgencyEntity user = repo.findByUsernameAndPassword(email, password);
        return user != null;
    }

}
