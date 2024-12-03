package com.xworkz.fileOperation.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MetroDto implements Serializable{
	
	private String from;
	private String to;
	private int price;

}
