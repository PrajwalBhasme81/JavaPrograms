package com.xworkz.javafeatures.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NamesRunner {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Manju");
		list.add("Suresh");
		List<String> result = list.stream()
            .filter(s -> s.length() >= 4)
            .map(String::toUpperCase)
            .collect(Collectors.toList());
	System.out.println(result);

	}
}
