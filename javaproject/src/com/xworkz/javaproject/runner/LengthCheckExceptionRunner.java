package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.exception.LengthCheckException;

public class LengthCheckExceptionRunner {
	public static void main(String[] args)throws LengthCheckException {
		String username = "Prajwal";
		int userlength = username.length();
		
		if(username.length() < 3 || username.length() > 15) {
		}
		System.out.println("Valid Username:"+username);
		System.out.println("username length is:"+userlength);
		throw new LengthCheckException (username);
	}

}
