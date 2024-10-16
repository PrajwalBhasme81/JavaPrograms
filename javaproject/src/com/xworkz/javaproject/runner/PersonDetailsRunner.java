package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.dto.PersonDetailsDto;
import com.xworkz.javaproject.service.AbstractPersonInformation;
import com.xworkz.javaproject.service.PrajwalDetails;
import com.xworkz.javaproject.service.SanjayDetails;

public class PersonDetailsRunner {
	
	public static void main(String[] args) {
	
	PersonDetailsDto details = new PersonDetailsDto();
	details.setName("Prajwal");
	details.setAge(22);
	details.setAddress("Gadag");
	details.setContactNo(9864653520l);

	AbstractPersonInformation details1 = new PrajwalDetails();
	details1.validatePersonDetails(details);
	
	AbstractPersonInformation details2 = new SanjayDetails();
	details2.validatePersonDetails(details);
	
	
	if(details.getName().length() >= 3)
	{
		System.out.println("Name is not Empty");
	}
	else
	{
		System.out.println("Name is Empty,Pls enter Name");
	}
	
	if(details.getAge() > 18)
	{
		System.out.println("Age is Greater than 18 or equal to 18");
	}
	else
	{
		System.out.println("Age is Lesser than 18");
	}
	
	if(details.getAddress().length() > 3)
	{
		System.out.println("Entered Address is correct");
	}
	else
	{
		System.out.println("Entered Address is incorrect pls enter correct address");
	}
	
	if(details.getContactNo() <= 10)
	{
		System.out.println("Entered Contact number is correct");
	}
	else
	{
		System.out.println("Entered Contact number is incorrect pls enter correct  Contact number");
	}
	}

}
//jar -xvf lombok.jar