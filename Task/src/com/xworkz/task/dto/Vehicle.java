package com.xworkz.task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Vehicle implements Comparable<Vehicle>{

	private String brand;
	private String model;
	private int topSpeed;
	
	@Override
	public int compareTo(Vehicle o) {
		return Integer.compare(this.topSpeed, o.topSpeed);
	}
	

}
