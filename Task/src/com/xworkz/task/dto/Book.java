package com.xworkz.task.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
	
	private String title;
    private String author;
    private double price;

}
