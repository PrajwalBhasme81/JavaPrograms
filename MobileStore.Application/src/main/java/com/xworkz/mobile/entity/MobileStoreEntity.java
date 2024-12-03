package com.xworkz.mobile.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class MobileStoreEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String brand;
	private int ram;
	private int storage;
	private int warranty;
	private int price;

}
