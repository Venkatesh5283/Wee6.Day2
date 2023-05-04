package baseclassAssignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ExcelCode;

public class BaseClassAssignmentThreadLocal extends AbstractTestNGCucumberTests{
	
	public static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();
	
	//public String filename;
	
	
	public void setDriver()
	{
		tldriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver()
	{
		return tldriver.get();
	}
	
	//@Parameters({"browser", "url"})
	
	

	
	@BeforeMethod
	public void preCondition() throws InterruptedException
	{
//		if(browser1.equalsIgnoreCase("Chrome"))
//		{
//			ChromeOptions copt = new ChromeOptions();
//			copt.addArguments("--disable-Notifications");
//			driver = new ChromeDriver(copt);
//		}
//		else if(browser1.equalsIgnoreCase("Edge"))
//		{
//			EdgeOptions eopt=new EdgeOptions();
//			eopt.addArguments("--disable-Notifications");
//			driver=new EdgeDriver(eopt);
//		}
		
		setDriver();
		
		 
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		getDriver().get("https://login.salesforce.com");
	}
	
	@AfterMethod
	public void postCondition()
	{
		getDriver().close();
		
	}
	
//	@DataProvider(name="DPName", indices= {2})
//	public String[][] fetchData() throws IOException
//	{
//		String[][] exceldata = ExcelCode.excelMethod(filename);
//		return exceldata;
//	}

}
