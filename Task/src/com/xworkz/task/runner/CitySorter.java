package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.City;

public class CitySorter {
	 public static void main(String[] args) {
	        List<City> cities = new ArrayList<>();

	        cities.add(new City("Los Angeles", 3979576));
	        cities.add(new City("new york", 8419600));
	        cities.add(new City("Chicago", 2716000));
	        cities.add(new City("San Francisco", 883305));
	        cities.add(new City("HOUSTON", 2320268));

	        System.out.println("Cities before sorting:");
	        for (City city : cities) {
	            System.out.println(city);
	        }

	        // Comparator to sort cities by name (case-insensitive)
	        Comparator<City> nameComparator = Comparator.comparing(city -> city.getName().toLowerCase());

	        // Sort the cities using the comparator
	        Collections.sort(cities, nameComparator);
	        System.out.println("\nCities sorted by name (case-insensitive):");
	        for (City city : cities) {
	            System.out.println(city);
	        }
	    }

}
