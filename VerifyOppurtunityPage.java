package pagesAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import baseclassAssignment.BaseClassAssignment;
import io.cucumber.java.en.Then;

public class VerifyOppurtunityPage extends BaseClassAssignment {
	
	
	
	@Then ("VerifyOppurtunity Name")

	
	public void verifyOpp() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement findElement=driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_neutral')]"));
		findElement.click();
		Thread.sleep(2000);
		
		String OptTitle = driver.findElement(By.xpath("(//span[@class='slds-text-body--regular slds-text-color--default slds-truncate slds-show'])[4]")).getAttribute("title");
		//String OptTitle = driver.findElement(By.xpath("//div[@id='suggestionsList-347']/search_dialog-instant-result-item[4]/div[1]/div[2]/span[1]/lightning-formatted-rich-text[1]/span[1]")).getText();
		System.out.println(OptTitle);
		
		String expTitle="POM Automation by Venkatesh";
		
		//Assert.assertEquals(OptTitle, expTitle);
		
	
		if(OptTitle.contains("Salesforce Automation By Venky"))
		{
			System.out.println("Oppurtunity Name is Verified Successfully and it was presented");
		}
		else
		{
			System.out.println("Oppurtunity Name is Verified Successfully and it was not presented");

		}
	}

}
