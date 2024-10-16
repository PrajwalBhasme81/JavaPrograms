package com.xworkz.javaproject.runner;

import com.xworkz.javaproject.exception.NullCheckException;

public class NullCheckExceptionRunner {
	public static void main(String[] args) throws NullCheckException{
		String username = null;
		if(username == null) {
			System.out.println("The username is Null");
		}
		else
		{
			System.out.println("valid username");
		}
		throw new NullCheckException(username );
	}

}
