package tesNGBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class testNGKeywords 
{
	@Test (groups="Functional")
	public void method1()
	{
		Reporter.log("Method-1",true);
	}
	
	@Test (invocationCount=3,groups={"Sanity","Functional"})
	public void method2()
	{ 
		Reporter.log("Method-2",true);
	}
	
	@Test (priority='1',groups={"Sanity","Functional"})
	public void method3()
	{
		Reporter.log("Method-3",true);
		Assert.fail();
	}
	
	@Test (priority='2',enabled=true,groups="Functional")
	public void method4()
	{
		Reporter.log("Method-4",true);
	}
	
	@Test (dependsOnMethods= {"method3"},groups={"Sanity","Functional"})
	public void method5()
	{
		Reporter.log("Method-5",true);
	}

	@Test (timeOut=5000)
	public void method6() throws InterruptedException
	{
		Reporter.log("Method-6",true);
//		Thread.sleep(6000);
	}
}
