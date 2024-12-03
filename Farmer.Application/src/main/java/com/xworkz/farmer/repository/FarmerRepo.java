package com.xworkz.farmer.repository;

import java.util.List;

import com.xworkz.farmer.dto.FarmerDto;

public interface FarmerRepo {

	public boolean save(FarmerDto dto);

	List<FarmerDto> read();

	boolean deleteById(int id);

	FarmerDto searchById(int id);

	boolean updateById(int id,FarmerDto dto);

}
