package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclassAssignment.BaseClassAssignment;
import io.cucumber.java.en.And;

public class NewOppurtunityPage extends BaseClassAssignment {
	
	
	
	
	
	@And ("Enter Opportunity name as {string}")
	public NewOppurtunityPage enterOppName(String OPPName2)
	{
		driver.findElement(By.xpath("(//input[@part='input'])[3]")).sendKeys(OPPName2);
		return this;
	}
	@And ("Choose close date as Today")
	public NewOppurtunityPage enterDate() throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("04/05/2023");
		Thread.sleep(3000);
		return this;
	}
	@And ("Select Stage as Need Analysis")
	public NewOppurtunityPage selectStage()
	{
        driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		return this;
	}
	@And ("click Save")
	public VerifyOppurtunityPage clickSave() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		return new VerifyOppurtunityPage();
	}
}
