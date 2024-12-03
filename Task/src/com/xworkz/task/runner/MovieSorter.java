package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Movie;

public class MovieSorter {
	public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Pulp Fiction", 8.9, 1994));
        movies.add(new Movie("Forrest Gump", 8.8, 1994));

        System.out.println("Movies before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Sort by rating (descending)
        Collections.sort(movies, (m1, m2) -> Double.compare(m2.getRating(), m1.getRating()));
        System.out.println("\nMovies sorted by rating (descending):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Sort by release year (ascending)
        Collections.sort(movies, Comparator.comparingInt(Movie::getReleaseYear));
        System.out.println("\nMovies sorted by release year (ascending):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

}
