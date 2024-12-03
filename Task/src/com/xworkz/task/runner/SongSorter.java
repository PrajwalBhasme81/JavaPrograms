package com.xworkz.task.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.task.dto.Song;

public class SongSorter {
	public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song("Imagine", 183));
        songs.add(new Song("Bohemian Rhapsody", 354));
        songs.add(new Song("Hey Jude", 431));
        songs.add(new Song("Song", 240));
        songs.add(new Song("Lose Yourself", 326));

        System.out.println("Songs before sorting:");
        for (Song song : songs) {
            System.out.println(song);
        }

        // Comparator to sort by name length (ascending)
        Comparator<Song> nameLengthComparator = Comparator.comparingInt(song -> song.getName().length());

        // Sort by name length
        songs.sort(nameLengthComparator);
        System.out.println("\nSongs sorted by name length (ascending):");
        for (Song song : songs) {
            System.out.println(song);
        }

        // Sort by name length and then by duration
        Comparator<Song> combinedComparator = nameLengthComparator.thenComparingInt(Song::getDuration);

        // Sort using the combined comparator
        songs.sort(combinedComparator);
        System.out.println("\nSongs sorted by name length and then by duration:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }

}
