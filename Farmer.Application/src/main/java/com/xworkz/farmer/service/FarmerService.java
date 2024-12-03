package com.xworkz.farmer.service;

import java.util.List;

import com.xworkz.farmer.dto.FarmerDto;

public interface FarmerService {

	public String validateandsave(FarmerDto dto);

	public List<FarmerDto> read();

	FarmerDto searchById(int id);

	String deleteById(int id);
	
	String updateById(int id,FarmerDto dto);

}
