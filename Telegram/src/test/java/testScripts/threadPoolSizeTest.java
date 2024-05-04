package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class threadPoolSizeTest {

	@Test(invocationCount = 5, threadPoolSize = 3)   //invocationCount = 0 ---> Not Execute &
	                                                 //enable = false ---> Not Execute
	public void register() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Register");
		Thread.sleep(2000);
		driver.quit();
	}
}
