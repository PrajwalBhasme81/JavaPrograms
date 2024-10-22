package com.xworkz.collection.repository;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.collection.dto.MusicDto;

public class MusicRepoImp implements MusicRepo {

	Set<MusicDto> music = new HashSet<MusicDto>();
	
	@Override
	public boolean save(MusicDto musicDto) {
		System.out.println("Save method is Running");
		return music.add(musicDto);
	}

	@Override
	public Set<MusicDto> readAll() {
		
		return music;
	}

}
