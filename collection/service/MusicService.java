package com.xworkz.collection.service;

import java.util.Set;

import com.xworkz.collection.dto.MusicDto;

public interface MusicService {
	
	String validation(MusicDto musicDto);
	
	Set<MusicDto> readAll();

}
