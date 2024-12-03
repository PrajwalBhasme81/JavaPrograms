package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Book;

public class BookSorter {
	 public static void main(String[] args) {
	        List<Book> books = new ArrayList<>();
	        
	        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
	        books.add(new Book("1984", "George Orwell", 8.99));
	        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 12.99));
	        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 9.99));
	        
	        System.out.println("Books before sorting:");
	        for (Book book : books) {
	            System.out.println(book);
	        }

	        // Sort by price in descending order
	        Comparator<Book> priceComparator = new Comparator<Book>() {
	            @Override
	            public int compare(Book b1, Book b2) {
	                return Double.compare(b2.getPrice(), b1.getPrice());
	            }
	        };
	        
	        Collections.sort(books, priceComparator);
	        System.out.println("\nBooks sorted by price (descending):");
	        for (Book book : books) {
	            System.out.println(book);
	        }

	        // Sort by title in alphabetical order
	        Comparator<Book> titleComparator = new Comparator<Book>() {
	            @Override
	            public int compare(Book b1, Book b2) {
	                return b1.getTitle().compareTo(b2.getTitle());
	            }
	        };
	        
	        Collections.sort(books, titleComparator);
	        System.out.println("\nBooks sorted by title (alphabetical):");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

}
