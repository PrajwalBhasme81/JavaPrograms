package com.xworkz.javafeatures.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xworkz.javafeatures.dto.ProductDto;

public class Product {

	public static void main(String[] args) {
		List<ProductDto>list = new ArrayList<ProductDto>();
		list.add(new ProductDto("AirBuds","Boat",2000));
		list.add(new ProductDto("Realme","Mobile",30000));
		list.add(new ProductDto("Dress","Cloth",1000));
		list.add(new ProductDto("Bottels","Material",500));
		Map<String, Product> getMostExpensiveProductsByCategory(List<Product> products) {
	        return products.stream()
	                .collect(Collectors.groupingBy(
	                        ProductDto::getCategory,
	                        Collectors.collectingAndThen(
	                                Collectors.maxBy(Comparator.comparingDouble(ProductDto::getPrice)),
	                                java.util.Optional::get)));
		 Map<String, Product> result = getMostExpensiveProductsByCategory(products);
	        result.forEach((category, product) -> System.out.println("Category: " + category + ", Most Expensive Product: " + product));

	}

}
