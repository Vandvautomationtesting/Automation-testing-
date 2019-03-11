package com.cg.BigBowl_grocery;

public class GroceryException extends Exception {
	private static final long serialVersionUID = 1L;
	public GroceryException()
	{
		super();
	}
	public GroceryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public GroceryException(String message, Throwable cause) 
	{
		super(message, cause);
	}
	public GroceryException(String message) 
	{
		super(message);			
	}
	public GroceryException(Throwable cause) 
	{
		super(cause);			
	}
}
