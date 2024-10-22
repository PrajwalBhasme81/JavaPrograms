package com.xworkz.collection.service;

import java.util.Set;

import com.xworkz.collection.dto.MusicDto;
import com.xworkz.collection.repository.MusicRepoImp;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class MusicServiceImp implements MusicService {

	private MusicRepoImp repo;
	@Override
	public String validation(MusicDto musicDto) {
		System.out.println("Validation is running");
		if(musicDto != null)
		{
			if(repo.save(musicDto))
			{
				return "Saved successfully";
			}
			return "Not Saved";
		}
		return "Dto is Null Validation Failed";
	}
	@Override
	public Set<MusicDto> readAll() {
		
		return repo.readAll();
	}

}
