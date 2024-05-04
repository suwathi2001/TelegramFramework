package testScripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ObjectRepository.JewelryPage;
import ObjectRepository.WelcomePage;
import genericLibrary.BaseClass;
import genericLibrary.UtilityMethods;

public class jewelryPageTest extends BaseClass {

	@Test
	public void jewelry_001() throws InterruptedException
	{
		WelcomePage welcome = new WelcomePage(driver);
		JewelryPage jewelry = new JewelryPage(driver);
		
		welcome.getjewelryLink().click();
		
		//Get the jewelry page Screenshot 
		getWebPageScreenshot(driver);
		
		//Get the screenshot of add to cart button
		
		getWebElementScreenshot(jewelry.getDiamondHeartAddToCartButton());
		
		//Get the screenshot of sort by dropdown
		
		getWebElementScreenshot(jewelry.getSortByDropdown());
		
		selectOptionByIndex(jewelry.getSortByDropdown(),2);
		Thread.sleep(2000);
		
		//selectOptionByValue(jewelry.getViewAsDropdown(),"https://demowebshop.tricentis.com/jewelry?viewmode=list");
		//Thread.sleep(2000);
		
		selectOptionByVisibleText(jewelry.getDisplayDropdown(),"12");
		Thread.sleep(2000);
		
		//switchToWindowByTitle(driver,"flipkart);
		
		//switchToWindowByUrl(driver,"https://flipkart.com");
	
	}
}
