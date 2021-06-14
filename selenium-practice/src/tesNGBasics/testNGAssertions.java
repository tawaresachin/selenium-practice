package tesNGBasics;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class testNGAssertions 
{
	
	@Test
	public void test1()
	{
		String str1="Hello";		// actual 
		String str2="Hi";			// expected
		Reporter.log("Testing String iteration-1", true);
		AssertJUnit.assertEquals(str1, str2);
		
	}
	
	@Test
	public void test2()
	{
		String str1="Hello";		// actual 
		String str2="Hi";			// expected
		Reporter.log("Testing String iteration-2", true);
		Assert.assertNotEquals(str1, str2);
	
	}
	
	@Test
	public void test3()
	{
		boolean flag1=true;				// actual e.g. isEnabled()
		boolean flag2=true;			// expected
		Reporter.log("Testing boolean iteration-1", true);
		Assert.assertTrue(flag1);
	}
	
	@Test
	public void test4()
	{
		Boolean flag1=true;				// actual e.g. isEnabled()
		Boolean flag2=false;			// expected
		Reporter.log("Testing boolean iteration-2", true);
		Assert.assertFalse(flag1);
	}
	
	@Test
	public void test5()
	{
		String str1="";
		String str2=null;
		Reporter.log("Testing null iteration-1", true);
		Assert.assertNull(str2);
	}
	
	@Test
	public void test6()
	{
		String str1="";
		String str2=null;
		Reporter.log("Testing null iteration-2", true);
		Assert.assertNotNull(str1);
	}
	
	@Test
	public void test7()
	{
		String str1="";
		String str2=null;
		Reporter.log("Testing null iteration-2", true);
		Assert.assertNotNull(str1);
		Assert.fail();
	}
	
	@Test
	public void test8()			// Hards Assert with Multiple Verifications 
	{
		String str1="";
		String str2=null;
		Reporter.log("Testing all Assertions", true);
		AssertJUnit.assertEquals(str1, "");
		AssertJUnit.assertTrue(true);
		Assert.assertNotNull(str2);
		AssertJUnit.assertFalse(false);
		System.out.println("I am not continuing verifications");
		Assert.fail();
	}
	
	@Test
	public void test9()			// Soft Assert with Multiple Verifications 
	{
		SoftAssert asrt = new SoftAssert();
		String str1="";
		String str2=null;
		Reporter.log("Testing all Assertions", true);
		AssertJUnit.assertEquals(str1, "");
		AssertJUnit.assertTrue(true);
		asrt.assertNotNull(str2);
		AssertJUnit.assertFalse(false);
		System.out.println("I am continuing verifications");
//		asrt.fail();
		asrt.assertAll();
	}

}
