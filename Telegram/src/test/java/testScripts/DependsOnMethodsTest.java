package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	@Test(groups = "regression")
	public void register() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Register");
		//driver.get("fsdgfh");
		System.out.println("Regression");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "register")//(priority = 1)
	public void login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Login");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "login")
	public void addToCart()
	{
		WebDriver driver = new FirefoxDriver();
		System.out.println("Add To Cart");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void payment()
	{
		WebDriver driver = new FirefoxDriver();
		System.out.println("Payment");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "payment")
	public void confirmPayment() {
		WebDriver driver = new FirefoxDriver();
		System.out.println("Confirm Payment");
		driver.quit();
	}
	
}
