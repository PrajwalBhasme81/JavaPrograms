package com.xworkz.Comprator.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class MetroTicketDto implements Comparable<MetroTicketDto>{
	
	private String from;
	private String to;
	private int price;
	
	@Override
	public int compareTo(MetroTicketDto dto) {
//		if(dto.getPrice() > this.price)
//			return 1;
//		if(dto.getPrice() < this.price)
//			return -1;
//		
//		return 0;
		
		return this.getFrom().compareToIgnoreCase(this.getTo());
	}
	
	

}
