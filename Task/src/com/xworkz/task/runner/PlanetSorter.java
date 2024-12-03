package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Planet;

public class PlanetSorter {
	public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet("Earth", 5.972E24, 12742));
        planets.add(new Planet("Mars", 0.64171E24, 6779));
        planets.add(new Planet("Jupiter", 1898.0E24, 139820));
        planets.add(new Planet("Venus", null, 12104)); // Null mass
        planets.add(new Planet("Mercury", 0.33011E24, 4879));
        planets.add(new Planet("Neptune", null, 49528)); // Null mass

        System.out.println("Planets before sorting:");
        for (Planet planet : planets) {
            System.out.println(planet);
        }

        // Comparator to sort by mass, placing nulls last
        Comparator<Planet> massComparator = Comparator.comparing(Planet::getMass, Comparator.nullsLast(Double::compare));

        // Sort the planets using the comparator
        planets.sort(massComparator);
        System.out.println("\nPlanets sorted by mass (nulls last):");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

}
