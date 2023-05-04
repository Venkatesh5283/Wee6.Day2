package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;
import io.cucumber.java.en.And;

public class AppLauncherPage extends BaseClassAssignment{
	

	@And ("click Sales from App Launcher")
	public SalesPage clickSales() throws InterruptedException
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		
		return new SalesPage();
	}

}
