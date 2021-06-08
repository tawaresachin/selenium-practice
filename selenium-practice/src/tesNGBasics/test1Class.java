package tesNGBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class test1Class 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		String str="BEFORE";
		System.out.println(str);
	}
	
	@Test
	public void method1()
	{
		System.out.println("I am test-1");
		Reporter.log("TEST-1 Reporting",true);
	}

	@Test
	public void method2()
	{
		System.out.println("I am test-2");
		
	}
	
	@Test()
	public void method3()
	{
		System.out.println("I am test-3");
		Assert.fail();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		String str="AFTER";
		System.out.println(str);
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
