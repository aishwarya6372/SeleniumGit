package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Before suit");
	}

     @BeforeTest
    public void beforeTest()
    {
	System.out.println("Before test");
     }
 
     @BeforeClass
     public void beforeClass()
 	{
 		System.out.println("Before class");
 	}

     @BeforeMethod
     public void beforeMehod()
 	{
 		System.out.println("Before Method");
 	}
     
     @Test
     public void Test()
 	{
 		System.out.println("Test");
 	}
     
     @AfterMethod
     public void afterMethod()
 	{
 		System.out.println("after method");
 	}

     @AfterClass
     public void afterClass()
 	{
 		System.out.println("aafter class");
 	}

     @AfterTest
     public void afterTest()
 	{
 		System.out.println("after test");
 	}

     @AfterSuite
     public void afterSuite()
 	{
 		System.out.println("after suite");
 	}




	
}
