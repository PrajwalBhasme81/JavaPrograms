package com.xworkz.javaproject.exception;

public class NullCheckException extends Throwable {
	public NullCheckException(String username)
	{
		super(username);
	}
}
