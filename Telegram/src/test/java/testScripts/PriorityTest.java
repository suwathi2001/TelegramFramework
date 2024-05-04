package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 0)
	public void register() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Register");
		driver.get("fsdgfh");
		driver.quit();
	}
	
	@Test(priority = 1)
	public void login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Login");
		driver.quit();
	}
	
	@Test(priority = 2)
	public void addToCart()
	{
		WebDriver driver = new FirefoxDriver();
		System.out.println("Add To Cart");
		driver.quit();
	}
	
	@Test(priority = 3)
	public void payment()
	{
		WebDriver driver = new FirefoxDriver();
		System.out.println("Payment");
		driver.quit();
	}
	
	@Test(priority = 4)
	public void confirmPayment() {
		WebDriver driver = new FirefoxDriver();
		System.out.println("Confirm Payment");
		driver.quit();
	}
	
}
