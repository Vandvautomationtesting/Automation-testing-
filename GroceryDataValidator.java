package com.cg.BigBowl_grocery;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.regex.Pattern;

import javax.sound.midi.MidiDevice.Info;
public class GroceryDataValidator{
	/*double getRandomNumber()
	{ 
		double x = Math.random();
		return x; 
	}*/
	
	public  static  boolean validateReferenceId(String referenceId)throws GroceryException
	{
		String custPattern="[0-9]{4,50}";
		if(Pattern.matches(custPattern,referenceId))
		{
		return true;
		}
		
		else
		{
			throw new GroceryException("reference id must be a number and should have atleast 4 digits in it");
		}
	}
	public  static  boolean validateGroceryName(String gname)throws GroceryException
	{
		String custPattern1="[A-Za-z0-9]{3,20}";
		if(Pattern.matches(custPattern1, gname))
		{
			return true;
		}
		else
		{
			throw new GroceryException("grocery name shouldcontains minimum 3 letters and it can be alphanumeric");
		}
	}
	
	public  static  boolean validateGroceryType(String gtype)throws GroceryException
	{
		//String custPattern2="[A-Za-z0-9]{3,20}";
		if(gtype.equalsIgnoreCase("Fruit")){
			return true;
			
		}
		else if(gtype.equalsIgnoreCase("Vegetable")){
			return true;
			
		}
		else if(gtype.equalsIgnoreCase("Beverages")){
			return true;
			
		}
		/*if(Pattern.matches(custPattern2, gtype))
		{
			return true;
		}*/
		else
		{
			throw new GroceryException("grocery type must be either 'Fruit' or 'Vegetable' or 'Beverages'");
		}
	}
	
	public  static  boolean validateQuantity(String quantity)throws GroceryException
	{
	String custPattern3="[0-9]{1,20}";
	if(Pattern.matches(custPattern3,quantity))
	{
	return true;
	}
	
	else
	{
		throw new GroceryException("quantity should be a number");
	}
	}
	public  static  boolean validateEntryDate(Date date)throws GroceryException
	{
		//String numberPattern="[6789][0-9]{9}";
		java.util.Date date1 = null;
		try {
		date1 = new SimpleDateFormat("dd/MM/yyyy").parse("20130925");
		} catch (Exception ex) {
	
		}
		ZonedDateTime date11=ZonedDateTime.now();
		
		if(date11.equals(date11))
		{
			return true;
		}
		else
		{
			throw new GroceryException("entry date should be current date");
		}
	}
	}
	
