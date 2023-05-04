package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SalesforceLoginPageAssignment extends BaseClassAssignment {
	
	
	
	
	@And ("Enter the Username as {string}")
	public SalesforceLoginPageAssignment salesforceUsername(String user1)
	{
		driver.findElement(By.id("username")).sendKeys(user1);
		return this;
		
	}
	@And ("Enter the Password as {string}")
	public SalesforceLoginPageAssignment salesforcePassword(String pass1)
	{
		driver.findElement(By.id("password")).sendKeys(pass1);
		return this;
	}
	@When ("Click on Login")
	public HomePageAssignment clicksalesforceLogin()
	{
		driver.findElement(By.id("Login")).click();
		return new HomePageAssignment();
	}
	

}
