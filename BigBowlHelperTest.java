package com.cg.BigBowl_grocery;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class BigBowlHelperTest{
	
		static BigBowlHelper collectionHelper;
		static GrocerySchema grocery=null;
		@BeforeClass
		public static void beforeClass()
		{
			collectionHelper=new BigBowlHelper();
			grocery =new GrocerySchema(1235, "Grapes","fruit",4);		
		}
		@AfterClass
		public static void afterClass()
		{		
			collectionHelper=null;
			grocery=null;
		}	
		@Test 
		public void testAddNewBook() throws GroceryException
		{
			collectionHelper.displayGroceryDetails();
			Assert.assertEquals(3, collectionHelper.displayGroceryDetails());
			Assert.assertNotNull(collectionHelper.toString());
			
		}
}
