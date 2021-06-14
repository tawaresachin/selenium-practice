package tesNGBasics;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization3 
{
	@Test
	@Parameters("user")
	public void test1(String user)
	{
		System.out.println("Please Enter Name of User");
		Reporter.log(user,true);
	}
	
	@Test(dataProvider="testData")
	public void test2(String user, String password)
	{
		System.out.println("User name is: "+user);
		System.out.println("Password is: "+password);
	}
	
	@DataProvider(name="testData")
	public Object[][] testData()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="Prashant";
		data[0][1]="prash123";
		
		data[1][0]="Abhi";
		data[1][1]="abhi456";
		
		return data;
	}

}
