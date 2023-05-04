package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;
import io.cucumber.java.en.And;

public class OppurtunityPage extends BaseClassAssignment {
	
	@And ("Click on New button")
	public NewOppurtunityPage clickNew() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(3000);
		return new NewOppurtunityPage();
	}
}
