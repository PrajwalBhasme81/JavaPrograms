package com.xworkz.javafeatures.runner;

import java.util.ArrayList;
import java.util.List;

public class WordFindout {
public static void main(String[] args) {
	List<String>list = new ArrayList<String>();
	list.add("Apple");
	list.add("Anicake");
	list.add("Grapes");
	list.add("Orange");
	list.add("Amul");
	list.add("Aravind");
	list.add("PineApple");
	list.stream().filter(s->s.startsWith("A")).forEach(e->System.out.println(e));
	
}
}

