package com.cg.BigBowl_grocery;
import java.util.Scanner;
/* this is the main class need to run for the execution of the program,*/
public class BigBowl_UI {

	static Scanner sc=new Scanner(System.in);
	static BigBowlHelper bigbowlhelper=null;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		bigbowlhelper=new BigBowlHelper();
		System.out.println("************WELCOME to Big Bowl online grocery store************");
		System.out.println("");
		while(true)
		{
			System.out.println("-------------MENU--------------");
			System.out.println("1:Enter grocery details \n"+"2:Successfully added grocery details \n"+"3:exit");
			System.out.println("\nEnter UR Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:	enterGroceryDetails();break;
			case 2: bigbowlhelper.displayGroceryDetails();break;
			default:System.exit(0);			
			}
		}
	}
	private static void enterGroceryDetails()
	{

		System.out.println("Enter the number of groceries:");
		int Ccount=sc.nextInt();
		while (Ccount!=0) {
			System.out.println("Enter referenceId:");
			String referenceId=sc.next();
			try 
			{
				if(GroceryDataValidator.validateReferenceId(referenceId))
				System.out.println("Enter Grocery Name");
				String gname=sc.next();
				if(GroceryDataValidator.validateGroceryName(gname))
				{
					System.out.println("Enter Grocery Type");
					String gtype=sc.next();
					if(GroceryDataValidator.validateGroceryType(gtype))
					{
						System.out.println("Enter Quantity");
						String quantity =sc.next();
						if(GroceryDataValidator.validateQuantity(quantity))
						{		
						GrocerySchema grocery=new GrocerySchema(Integer.parseInt(referenceId), gtype, gname,Integer.parseInt(quantity));
						bigbowlhelper.addNewGroceryDetails(grocery);
						System.out.println("successfully added the details");
						}	
					}
				}
			}
			catch (GroceryException e)
			{			
				System.out.println(e.getMessage());
			}
			Ccount--;
		}
	}
}

