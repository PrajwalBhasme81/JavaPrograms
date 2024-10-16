package com.xworkz.javaproject.runner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayLists
{
	public static void main(String[] args) 
	{
		List<String> streams = new LinkedList<String>();
		streams.add("CSE");
		streams.add("ISE");
		streams.add("ECE");
		streams.add("MECH");
		streams.add("CIVIL");
		streams.add(2, "EEE");
		streams.forEach(s->System.out.println("Streams is: "+s));
		streams.contains(streams);
		streams.get(3);
		streams.remove(5);
		streams.set(2, "Airospace");
		streams.subList(0, 3);
		streams.clear();
		streams.isEmpty();
		System.out.println("---------------------");
		streams.forEach(s->System.out.println("Streams is: "+s));
		
		System.out.println("---------------------");
		
		ArrayList<String> mobiles = new ArrayList<String>();
		mobiles.add("Poco");
		mobiles.add("Redmi");
		mobiles.add("Motorola");
		mobiles.add("Vivo");
		mobiles.forEach(s->System.out.println("Mobile Brand is: "+s));
		mobiles.set(1, "Oppo");
		mobiles.contains("Poco");
		System.out.println("---------------------");
		
		mobiles.get(1);
		mobiles.remove(3);
		mobiles.size();
		mobiles.subList(1, 2);
		mobiles.clear();
		mobiles.isEmpty();
		mobiles.forEach(s->System.out.println("Mobile Brand is: "+s));
	}

	

}
