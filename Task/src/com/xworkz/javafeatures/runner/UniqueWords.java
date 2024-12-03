package com.xworkz.javafeatures.runner;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWords {

	public static void main(String[] args) {
	List<String>sentences = List.of("Hi How are you","Java Proramming","This is My First Program");
	List<String>unique = sentences.stream().flatMap(sentence ->Arrays.stream(sentence.split(""))).map(String::toUpperCase).distinct().collect(Collectors.toList());
        System.out.println(unique);
	}

}

