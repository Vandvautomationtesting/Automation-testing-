package com.cg.BigBowl_grocery;

import java.util.ArrayList;
import java.util.Iterator;
public class BigBowlHelper {
	private  static ArrayList<GrocerySchema> groceryList=null;
	static
	{
		groceryList=new ArrayList<GrocerySchema>();
		GrocerySchema b1=new GrocerySchema(1234,"Apple","Fruit",8);
		GrocerySchema b2=new GrocerySchema(3245,"Banana","Fruit",6);
		GrocerySchema b3=new GrocerySchema(5467,"Brinjal","Vegetable",12);

		groceryList.add(b1);
		groceryList.add(b2);
		groceryList.add(b3);		

	}
public BigBowlHelper(){}
	
	/*************Add New Grocery in ArrayList************/
	public void addNewGroceryDetails(GrocerySchema grocery) 
	{			
			
			groceryList.add(grocery);	
			
	}
	
	public static ArrayList<GrocerySchema> getgroceryList() {
		return groceryList;
	}

	public static void setbookList(ArrayList<GrocerySchema> groceryList) {
		BigBowlHelper.groceryList = groceryList;
	}

	
	/*************Fetch All grocery Details 
	 * @return 
	 * @return ***********/

	public static int displayGroceryDetails()
	{
		Iterator<GrocerySchema> groceryIt=groceryList.iterator();
		GrocerySchema tempGrocery=null;
		
		int totalCount=0;
		while(groceryIt.hasNext())
		{
			totalCount++;
			tempGrocery=groceryIt.next();
			System.out.println(tempGrocery);
			
		}
		System.out.println("Total number of groceries taken:" +totalCount);
		return totalCount;
	}

	
}