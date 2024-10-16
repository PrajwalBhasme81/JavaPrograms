package com.xworkz.javaproject.service;

import com.xworkz.javaproject.dto.PersonDetailsDto;

public class PrajwalDetails extends AbstractPersonInformation {
	
	@Override
	public boolean validatePersonDetails(PersonDetailsDto personsDto)
	{
		System.out.println("Validate method is running in PrajwalDetails");
		return false;
	}

}
