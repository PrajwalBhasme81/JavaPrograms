package com.xworkz.ott.runner;

import com.xworkz.ott.entity.OttEntity;
import com.xworkz.ott.repository.OttRepo;
import com.xworkz.ott.repository.OttRepoImp;
import com.xworkz.ott.service.OttService;
import com.xworkz.ott.service.OttServiceImp;

public class OttRunner {

	public static void main(String[] args) {
		
		OttEntity entity = new OttEntity();
		entity.setName("Sagar");
		entity.setEmail("younus29@gmail.com");
		
		OttRepo r1 = new OttRepoImp();
		OttService s1 = new OttServiceImp(r1);
		
		//s1.save(entity);
		//System.out.println(s1.findById("sagar12@gmail.com"));
		
		//s1.update(entity, "sagar12@gmail.com");
		
		s1.deleteById("sagar12@gmail.com");

	}

}
