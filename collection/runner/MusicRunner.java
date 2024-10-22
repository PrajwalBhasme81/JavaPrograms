package com.xworkz.collection.runner;

import com.xworkz.collection.dto.MusicDto;
import com.xworkz.collection.repository.MusicRepoImp;
import com.xworkz.collection.service.MusicService;
import com.xworkz.collection.service.MusicServiceImp;

public class MusicRunner {

	public static void main(String[] args) {
		
		MusicDto dto = new MusicDto();
		dto.setMusicId(101);
		dto.setMusicName("Kala");
		dto.setSingerName("Mallikarjun");
		
		MusicService service = new MusicServiceImp(new MusicRepoImp());
		
		System.out.println(service.validation(dto));
		
		System.out.println(service.readAll());
		
		
		
	}

}
