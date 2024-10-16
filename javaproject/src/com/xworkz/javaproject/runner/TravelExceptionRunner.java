package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.exception.TravelException;

public class TravelExceptionRunner {

	public static void main(String[] args) throws /*TravelException*/ NullPointerException{
		String name[] = {"a","b"};
		try {
			if(name.length != 0)
			{
				System.out.println("Name Length:"+name.length);
				System.out.println("Array length is more then 0");
			}
		}
		catch(NullPointerException reference){
			System.out.println("Array length is 0");
		}
		//throw new TravelException("Bangalore");

	}

}
