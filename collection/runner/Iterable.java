package com.xworkz.collection.runner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public interface Iterable extends Iterator {
	public static void main(String[] args) {
		System.out.println("Main method is Running");
		
		List<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Program");
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("---------------------------");
		
		List<String> lists = new LinkedList<String>();
		lists.add("Programming");
		lists.add("Class");
		
		ListIterator<String> listIterator = lists.listIterator();
		listIterator.add("Hi");
		listIterator.add("Everyone");
		
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		System.out.println("................");
		
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		
		System.out.println("---------------------------");

		List<String> list1 = new LinkedList<String>();
		
		ListIterator<String> listIterator1 = list1.listIterator();
		listIterator1.add("Krishna@gmail.com");
		listIterator1.add("Soma@gmail.com");
		listIterator1.add("Rama@gmail.com");
		listIterator1.add("Bheema@gmail.com");
		
		
		while(listIterator1.hasNext())
		{
			System.out.println(listIterator1.next());
		}
		
		System.out.println("................");
		
		while(listIterator1.hasPrevious())
		{
			System.out.println(listIterator1.previous());
		}
		listIterator1.remove();

		
	}

}
