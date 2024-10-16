package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.exception.ArrayLengthException;

public class ArrayLengthExceptionRunner {

	public static void main(String[] args) throws ArrayLengthException{
		String[] array = {"A","B"};
		validateArrayLength(array);
		
	}

	public static void validateArrayLength(String[] array) throws ArrayLengthException {
		if(array.length < 1)
		{
			throw new ArrayLengthException("Array cannot be Empty");
		}
		
		System.out.println("Array is valid");
	}

}
