package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Gadget;

public class GadgetSorter {
	public static void main(String[] args) {
        List<Gadget> gadgets = new ArrayList<>();

        gadgets.add(new Gadget("BrandA", 24, 199.99));
        gadgets.add(new Gadget("BrandB", 20, 149.99));
        gadgets.add(new Gadget("BrandC", 24, 129.99));
        gadgets.add(new Gadget("BrandD", 18, 99.99));
        gadgets.add(new Gadget("BrandE", 20, 249.99));

        System.out.println("Gadgets before sorting:");
        for (Gadget gadget : gadgets) {
            System.out.println(gadget);
        }

        // Create comparator for sorting by batteryLife (highest to lowest) and price (lowest to highest)
        Comparator<Gadget> batteryLifeComparator = Comparator.comparingInt(Gadget::getBatteryLife).reversed()
                .thenComparingDouble(Gadget::getPrice);

        // Sort the gadgets using the comparator
        Collections.sort(gadgets, batteryLifeComparator);
        
        System.out.println("\nGadgets sorted by battery life (highest to lowest) and price (lowest to highest):");
        for (Gadget gadget : gadgets) {
            System.out.println(gadget);
        }
    }

}
