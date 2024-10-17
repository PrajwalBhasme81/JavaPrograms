package com.xworkz.vendors.runner;

 import java.util.Scanner;

import com.xworkz.vendors.dto.VendorDto;
import com.xworkz.vendors.service.VendorService;
import com.xworkz.vendors.repository.VendorRepositoryImplementation;
import com.xworkz.vendors.service.VendorServiceImplementation;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class VendorRunner {
  public static void main(String[] args) 
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the Choice");
	  System.out.println("Enter 1 to add VendorSave");
	  System.out.println("Enter 2 to add VendorRead");
	  System.out.println("Enter 3 to add VendorUpdate");
	  System.out.println("Enter 4 to add VendorDelete");
	  
	  int choice = 0;
	  choice = scan.nextInt();
	  
	  	VendorDto dto = new VendorDto();
		dto.setVendorId(1);
		dto.setVendorName("Prajwal");
		dto.setProductType("Cars");
		dto.setVendorEmail("Prajwal@gamil.com");
		dto.setVendorContactNumber(9988776655L);
		
		VendorService service = new VendorServiceImplementation(new VendorRepositoryImplementation());
		
		//update
		VendorDto newDto = new VendorDto();
		newDto.setVendorId(1);
		newDto.setVendorName("Sanjay");
		newDto.setProductType("Watches");
		newDto.setVendorEmail("sanjay@gamil.com");
		newDto.setVendorContactNumber(9988776655L);
		
		while(choice <= 4) 
		{
			switch(choice)
			{
				case 1 : 
					System.out.println(service.validate(dto));
					break;
				
				case 2 :
					System.out.println(service.getAll());
					break;
					
				case 3 :
					System.out.println(service.updateById(1, newDto));
					System.out.println(service.getAll());
					break;
					
				case 4 :
					System.out.println(service.deleteById(1, newDto));
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
