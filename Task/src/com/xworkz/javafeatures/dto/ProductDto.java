package com.xworkz.javafeatures.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {

	private String prod_name;
	private String prod_category;
	private int price;
}

