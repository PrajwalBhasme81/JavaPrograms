package com.xworkz.zomato.service;

import java.util.List;

import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.repository.ZomatoRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ZomatoServiceImp implements ZomatoService {

	private ZomatoRepo repo;
	@Override
	public String validateandsave(ZomatoDto dto) {
		if(dto != null) {
			
			if(repo.save(dto)) {
				System.out.println("Saved to Database");
				return "Saved";
			}
		}
		return "Not Saved";
		
	}
	@Override
	public List<ZomatoDto> read() {
		
		return repo.read();
	}

	

}
