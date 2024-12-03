package com.xworkz.zomato.service;

import java.util.List;

import com.xworkz.zomato.dto.ZomatoDto;

public interface ZomatoService {
	
	public String validateandsave(ZomatoDto dto);
	
	public List<ZomatoDto> read();

}
