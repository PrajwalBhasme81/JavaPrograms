package com.xworkz.javaproject.exception;

public class TravelException extends Throwable{
	public TravelException(String place) {
		super(place);
		System.out.println("Travelling Place: "+place);
	}
}
