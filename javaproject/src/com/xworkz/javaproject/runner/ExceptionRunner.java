package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.exception.ClassTimingException;

public class ExceptionRunner {

	public static void checkClassTime(String message) throws ClassTimingException{
		throw new ClassTimingException("Message is:"+message);
	}
	
	public static void main(String[] args) throws ClassTimingException 
	{
		String message = "Hello Gooding evening";
		checkClassTime(message);
	}

}
