package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class invocationCountTest {
	
	@Test(groups = "FT",invocationCount = 5)
	public void register()
	{
		WebDriver driver = new FirefoxDriver();
		System.out.println("Register");
		System.out.println("FT");
		driver.quit();
	}

}
