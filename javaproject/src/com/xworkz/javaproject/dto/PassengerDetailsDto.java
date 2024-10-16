package com.xworkz.javaproject.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class PassengerDetailsDto {
	private String name;
	private int age;
	private long mobileNumber;
	private long aadharNumber;
	private double totalAmount;

}
