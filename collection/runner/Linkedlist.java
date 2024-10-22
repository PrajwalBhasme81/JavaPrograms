package com.xworkz.collection.runner;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

		public static void main(String[] args) {
			List<String> list = new LinkedList<String>();
			list.add("Cricket");
			list.add("Football");
			list.add("Basketball");
			list.add(1, "Hockey");
			list.add("Valiball");
			list.add("Kho-Kho");
			list.forEach(sports->System.out.println(sports));
			list.get(2);
			list.forEach(sports->System.out.println(sports));
			list.indexOf("Cricket");
			list.lastIndexOf("Hockey");
			list.remove(3);
			list.remove("Hockey");
			list.set(1, "Kabaddi");
			list.size();
			list.sort(null);
			list.subList(1,3);
			list.clear();
			list.forEach(sports->System.out.println(sports));
			System.out.println("------------------");
			
			
			LinkedList<String> link = new LinkedList<String>();
			link.add("Dog");
			link.add("Cat");
			link.add("Elephant");
			link.add("Camel");
			link.add(2, "Rabbit");
			link.forEach(animals->System.out.println(animals));
			link.addFirst("Cow");
			link.addLast("Tiger");
			System.out.println("------------------");
			link.forEach(animals->System.out.println(animals));
			System.out.println("------------------");
			link.contains("Lion");
			link.forEach(animals->System.out.println(animals));
			System.out.println("------------------");
			link.element();
			link.forEach(animals->System.out.println(animals));
			System.out.println("------------------");
			link.get(3);
			link.getFirst();
			link.getLast();
			link.indexOf(link);
			link.offer("Cat");
			link.offerFirst("Goat");
			link.offerLast("Rat");
			link.peek();
			link.peekFirst();
			link.peekLast();
			link.forEach(animals->System.out.println(animals));
			System.out.println("------------------");
			link.poll();
			link.pollFirst();
			link.pollLast();
			link.pop();
			link.push("Snake");
			link.remove();
			link.remove(3);
			link.remove("Cat");
			link.removeFirst();
			link.removeLast();
			link.set(1, "Dear");
			link.size();
			link.add("Bear");
			link.add("Monkey");
			link.subList(1, 3);
			link.clear();
			link.forEach(animals->System.out.println(animals));
			
	}

}

