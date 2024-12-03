package com.xworkz.javafeatures.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.javafeatures.dto.EmployeeDto;

public class EmployeeRunner {

	public static void main(String[] args) {
		List<EmployeeDto>dto = new ArrayList<EmployeeDto>();
		dto.add(new EmployeeDto("Prajwal",60000,35,"IT"));
		dto.add(new EmployeeDto("Sanjay",75000,40,"IT"));
		dto.add(new EmployeeDto("Vinayak",55000,45,"ProductBased"));
		dto.add(new EmployeeDto("Manjunath",80000,30,"IT"));
		dto.add(new EmployeeDto("Rohit",70000,50,"IT"));
		dto.add(new EmployeeDto("Rohan",50000,55,"Non-IT"));
		dto.add(new EmployeeDto("Vishal",650000,45,"ProductBased"));
		List<String> highEarnerNames = dto.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .map(EmployeeDto::getName)
                .collect(Collectors.toList());
		System.out.println(highEarnerNames);
		Optional<String> employeeName = dto.stream()
                .filter(employee -> employee.getAge() > 30 && "IT".equals(employee.getDepartment()))
                .map(EmployeeDto::getName)
                .findFirst();
		System.out.println(employeeName);


	}
}

