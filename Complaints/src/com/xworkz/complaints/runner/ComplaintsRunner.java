package com.xworkz.complaints.runner;

import java.util.Scanner;

import com.xworkz.complaints.dto.ComplaintsDto;
import com.xworkz.complaints.repository.ComplaintsRepositoryImplementation;
import com.xworkz.complaints.service.ComplaintsService;
import com.xworkz.complaints.service.ComplaintsServiceImplementation;


import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ComplaintsRunner 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Choice");
		System.out.println("Enter 1 to add ComplaintsSave");
		System.out.println("Enter 2 to add ComplaintsRead");
		System.out.println("Enter 3 to add ComplaintsUpdate");
		System.out.println("Enter 4 to add ComplaintsDelete");
		
		int choice = 0;
		choice = scan.nextInt();
		
		ComplaintsDto dto = new ComplaintsDto();
		dto.setComplaintId(10);
		dto.setComplaintType("Road");
		dto.setComplaintLocation("Bangaluru");
		
		ComplaintsService service = new ComplaintsServiceImplementation(new ComplaintsRepositoryImplementation());
		
		//update
		ComplaintsDto newDto = new ComplaintsDto();
		newDto.setComplaintId(11);
		newDto.setComplaintType("Water");
		newDto.setComplaintLocation("Btm");
		
		while(choice <= 4) 
		{
			switch(choice)
			{
				case 1 : 
					System.out.println(service.Validate(dto));
					break;
				
				case 2 :
					System.out.println(service.getAll());
					break;
					
				case 3 :
					System.out.println(service.updateById(10, newDto));
					System.out.println(service.getAll());
					break;
					
				case 4 :
					System.out.println(service.deleteById(11, newDto));
					System.out.println(service.getAll());
				
				default :
					System.out.println("Invalid Choice");
					System.out.println("Enter the number 1 or 2 or 3 or 4");
			}
			
			System.out.println("Enter the Chioce");
			choice = scan.nextInt();
			
		}
	}

}
