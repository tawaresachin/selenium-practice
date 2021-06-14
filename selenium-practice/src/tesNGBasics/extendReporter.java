package tesNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extendReporter {
static ExtentTest test;
static ExtentReports report;

@BeforeClass
public static void startTest()
{
report = new ExtentReports(System.getProperty("D:\\Study\\Testing Class\\local\\selenium-practice\\test-output")+"ExtentReportResults.html");
test = report.startTest("extendReporter");
}
@Test
public void extentReportsDemo()
{
System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
if(driver.getTitle().equals("Google"))
{
test.log(LogStatus.PASS, "Navigated to the specified URL");
}
else
{
test.log(LogStatus.FAIL, "Test Failed");
}
}
@AfterClass
public static void endTest()
{
report.endTest(test);
report.flush();
}
}