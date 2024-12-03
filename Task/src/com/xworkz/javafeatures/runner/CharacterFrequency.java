package com.xworkz.javafeatures.runner;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> getCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "hello";
        Map<Character, Integer> result = getCharacterFrequency(input);
        System.out.println(result);
    }
}
