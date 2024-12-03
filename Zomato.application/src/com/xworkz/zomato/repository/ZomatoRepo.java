package com.xworkz.zomato.repository;

import java.util.List;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoRepo {
	
	public boolean save(ZomatoDto dto);

	List<ZomatoDto> read();

}
