package com.xworkz.zomato.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ZomatoDto {
	private int id;
	private String foodName;
	private float price;
	private String deliveryLocation;
	

}
