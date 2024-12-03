package com.xworkz.mobile.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MobileStoreDto {
	
	private int id;
	private String brand;
	private int ram;
	private int storage;
	private int warranty;
	private int price;

}
