package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.task.dto.Vehicle;

public class VehicleSorter {
	public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Vehicle("Toyota", "Corolla", 180));
        vehicles.add(new Vehicle("Ferrari", "488", 330));
        vehicles.add(new Vehicle("Honda", "Civic", 200));
        vehicles.add(new Vehicle("Ford", "Mustang", 250));
        
        System.out.println("Before sorting:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        // Sort the vehicles by top speed
        Collections.sort(vehicles);

        System.out.println("\nAfter sorting by top speed:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

}
