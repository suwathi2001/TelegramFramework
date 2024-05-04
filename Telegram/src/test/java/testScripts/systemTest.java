package testScripts;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepository.BookPage;
import ObjectRepository.LogInPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.SauceLoginPage;
import ObjectRepository.demowebshopPage;

public class systemTest {

	@Test
	public void sT_29()
	{
		//Verify by placing the order from cart section
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SauceLoginPage order = new SauceLoginPage(driver);
		order.getusernameLink().sendKeys("standard_user");
		order.getpasswordLink().sendKeys("secret_sauce");
		order.getLoginButtton().click();
		
		order.getAddtoCartButton().click();
		order.getcartButton().click();
		order.getcheckOut().click();
		
		order.getfirstName().sendKeys("Suwathi");
		order.getlastName().sendKeys("Velumani");
		order.getpostalCode().sendKeys("600093");
		
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 1000).perform();
		
		order.getcontinueButton().click();
		
		order.getfinish().click();
		String confirmation = order.getorderPlaced().getText();
		System.out.println("Confirmation:"+confirmation);
		
		driver.quit();
	}
	
	@Test
	public void sT_30()
	{
		//Verify by increasing the quantity count and check the amount has increased
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LogInPage login = new LogInPage(driver);
		BookPage book = new BookPage(driver);
		
		login.getloginLink().click();
		login.getEmail().sendKeys("suwathi315@gmail.com");
		login.getPassword().sendKeys("Suwathi@26");
		login.getLoginButton().click();
		book.getBooksLink().click();
		book.getaddToCart().click();
		book.getshoppingCart().click();
		book.getquantity().sendKeys("3");
		String price = book.getprice().getText();
		System.out.println("Price :" +price);
		
		driver.quit();
		
				
	}
	
}
