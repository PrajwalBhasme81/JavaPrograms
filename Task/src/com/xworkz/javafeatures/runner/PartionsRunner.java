package com.xworkz.javafeatures.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionsRunner {
public static void main(String[] args) {
	List<Integer>list = new ArrayList<Integer>();
	list.add(30);
	list.add(20);
	list.add(10);
	list.add(4);
	list.add(3);
	list.add(9);
	list.add(6);
	Map<Boolean, List<Integer>> partitioned = list.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
	System.out.println(partitioned);

}
}

