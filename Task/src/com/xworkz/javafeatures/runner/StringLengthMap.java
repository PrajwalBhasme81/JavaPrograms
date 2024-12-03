package com.xworkz.javafeatures.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        Map<String, Integer> stringLengthMap = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        String::length
                ));

        System.out.println(stringLengthMap);
    }
}