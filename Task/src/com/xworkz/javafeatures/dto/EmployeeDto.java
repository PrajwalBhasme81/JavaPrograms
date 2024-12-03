package com.xworkz.javafeatures.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private String name;
	private int salary;
	private int age;
	private String department;
}

