package com.xworkz.zomato.runner;

import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.repository.ZomatoRepo;
import com.xworkz.zomato.repository.ZomatoRepoImp;
import com.xworkz.zomato.service.ZomatoService;
import com.xworkz.zomato.service.ZomatoServiceImp;

public class ZomatoRunner {
	
	public static void main(String[] args)
	{
		ZomatoDto dto = new ZomatoDto();
		dto.setFoodName("Idly");
		dto.setPrice(40);
		dto.setDeliveryLocation("JP Nagar");
		
		ZomatoRepo r1 = new ZomatoRepoImp();
		
		ZomatoService s1 = new ZomatoServiceImp(r1);
		String res = s1.validateandsave(dto);
		System.out.println(s1.read());
		System.out.println(res);
	}
}
