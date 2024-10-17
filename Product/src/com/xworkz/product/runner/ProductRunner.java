package com.xworkz.product.runner;

import java.util.Scanner;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.repository.ProductRepositoryImplementation;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImplementation;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductRunner {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Choice");
		System.out.println("Enter 1 to add ProductSave");
		System.out.println("Enter 2 to add ProductRead");
		System.out.println("Enter 3 to add ProductUpdate");
		System.out.println("Enter 4 to add ProductDelete");
		
		int choice = 0;
		choice = scan.nextInt();
		   
		ProductDto dto = new ProductDto();
		dto.setProductId(101);
		dto.setProductName("SimCards");
		dto.setProductManufacturedYear(2024);
		
		ProductService service = new ProductServiceImplementation(new ProductRepositoryImplementation());
		
		//update
		ProductDto newDto = new ProductDto();
		newDto.setProductId(102);
		newDto.setProductName("Airpods");
		newDto.setProductManufacturedYear(2023);
		
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
					System.out.println(service.updateById(101, newDto));
					
					break;
					
				case 4 :
					System.out.println(service.deleteById(102, newDto));
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
