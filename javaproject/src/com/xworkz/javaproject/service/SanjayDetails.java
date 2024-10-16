package com.xworkz.javaproject.service;

import com.xworkz.javaproject.dto.PersonDetailsDto;

public class SanjayDetails extends AbstractPersonInformation{

	@Override
	public boolean validatePersonDetails(PersonDetailsDto personDto) 
	{
		System.out.println("validate method is rinning in SanjayDetails");
		return false;
	}
	

}
