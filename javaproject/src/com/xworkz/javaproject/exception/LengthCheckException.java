package com.xworkz.javaproject.exception;

public class LengthCheckException extends Throwable {
	public LengthCheckException(String username)
	{
		super(username);
	}

}
