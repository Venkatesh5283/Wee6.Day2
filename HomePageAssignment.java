package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;
import io.cucumber.java.en.And;

public class HomePageAssignment extends BaseClassAssignment  {
	

@And ("Click on toggle menu button from the left corner")

	public HomePageAssignment clickToggleButton()
	{
		driver.findElement(By.className("slds-icon-waffle")).click();
		return this;
	}
	
@And ("Click view All")
	public AppLauncherPage clickViewAll()
	{
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return new AppLauncherPage();
	}
	
	
}
