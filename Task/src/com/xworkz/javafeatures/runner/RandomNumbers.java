package com.xworkz.javafeatures.runner;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumbers {

	public static void main(String[] args) {
		        Random random = new Random();
		        Stream.generate(() -> random.nextInt(100) + 1) .limit(20).forEach(System.out::println);
		    


	}

}
