package com.xworkz.collection.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StoreEA {
	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("Raj@gmail.com");
		list.add("Nitin@gmail.com");
		ListIterator<String> listIterator = list.listIterator();
		listIterator.add("Krishna@gmail.com");
		listIterator.add("Soma@gmail.com");
		listIterator.add("Rama@gmail.com");
		listIterator.add("Bheema@gmail.com");

		System.out.println("Has Next is there:"+listIterator.hasNext());

		System.out.println("Has Previous is there:"+listIterator.hasPrevious());

		System.out.println("-------Next----------");
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}

		System.out.println("-------Previous----------");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		System.out.println("----------");
		System.out.println(list.contains("Raj@gmail.com"));

		list.add(0, "shashi@gmail.com");
		list.forEach(s->System.out.println(s));

	}

}
