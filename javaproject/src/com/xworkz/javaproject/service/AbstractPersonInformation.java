package com.xworkz.javaproject.service;

import com.xworkz.javaproject.dto.PersonDetailsDto;

public abstract class AbstractPersonInformation {
	
	public abstract boolean validatePersonDetails(PersonDetailsDto personDto);

}
