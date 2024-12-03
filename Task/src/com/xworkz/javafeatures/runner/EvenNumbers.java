package com.xworkz.javafeatures.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer>listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(30);
		listOfNumbers.add(20);
		listOfNumbers.add(40);
		listOfNumbers.add(10);
		listOfNumbers.add(50);
		listOfNumbers.add(6);
		listOfNumbers.add(9);
		long count = listOfNumbers.stream().filter(n->n%2==0).count();
		System.out.println("Even Count is:"+count);
		System.out.println("----------Square-----------");
		List<Integer>square = listOfNumbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(square);
	}
}

