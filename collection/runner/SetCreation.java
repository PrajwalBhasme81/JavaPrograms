package com.xworkz.collection.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCreation {

	public static void main(String[] args) 
	{
		Set<String> set = new LinkedHashSet<>();
		System.out.println("Using LinkedHashSet");
		set.add("Bike");
		set.add("Car");
		System.out.println(set.contains("Car"));
		System.out.println(set.equals("Bus"));
		System.out.println(set.isEmpty());
		System.out.println(set);
		set.remove("Car");
		System.out.println(set.size());
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println(set.isEmpty());
		
		System.out.println("---------End---------");
		
		Set<String> set1 = new HashSet<>();
		System.out.println("Using HashSet");
		set1.add("Tiger");
		set1.add("Lion");
		set1.add("Monyey");
		System.out.println(set1.contains("Lion"));
		System.out.println(set1.equals("Dog"));
		System.out.println(set1.isEmpty());
		System.out.println(set1);
		set1.remove("Tiger");
		System.out.println(set1.size());
		System.out.println(set1);
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		
		
		System.out.println("---------End---------");
		
		Set<String> set2 = new TreeSet<>();
		System.out.println("Using TreeSet");
		set2.add("Mango");
		set2.add("Apple");
		set2.add("Banana");
		System.out.println(set2.contains("Mango"));
		System.out.println(set2.equals("Apple"));
		System.out.println(set2.isEmpty());
		System.out.println(set2);
		set2.remove("Banana");
		System.out.println(set2.size());
		System.out.println(set2);
		set2.clear();
		System.out.println(set2);
		System.out.println(set2.isEmpty());
	}

}
