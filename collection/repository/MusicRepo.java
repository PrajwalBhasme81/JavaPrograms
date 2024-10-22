package com.xworkz.collection.repository;

import java.util.Set;

import com.xworkz.collection.dto.MusicDto;

public interface MusicRepo {
	boolean save(MusicDto musicDto);
	
	Set<MusicDto> readAll();

}
