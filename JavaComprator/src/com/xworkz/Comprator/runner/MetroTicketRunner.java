package com.xworkz.Comprator.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.Comprator.dto.MetroTicketDto;

public class MetroTicketRunner {
	public static void main(String[] args) {
		
		List<MetroTicketDto> dto = new ArrayList<MetroTicketDto>();
		
		dto.add(new MetroTicketDto("Banashankari","RV Road",10));
		dto.add(new MetroTicketDto("RV Road","National College",15));
		dto.add(new MetroTicketDto("Mahalaxmi","RV Road",35));
		System.out.println("------Before------");
		System.out.println(dto);
		Collections.sort(dto);
		System.out.println("------After------");
		System.out.println(dto);
		
		System.out.println("----------------------------");
		
		String message = "Hello How are you";
		String a[] = message.split(" ");
		List<String> list = Arrays.asList(a);
		System.out.println("List: "+list);
		Comparator<String> com = (String s1,String s2)->s1.compareToIgnoreCase(s2);
		Collections.sort(list, com);
		System.out.println("List: "+list);
		
		
		
	}

}
