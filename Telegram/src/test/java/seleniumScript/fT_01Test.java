package seleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fT_01Test {

	
		public static void main(String[] args) throws InterruptedException {
			//Click on the books button and check the title of page

			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.linkText("Books")).click();
			Thread.sleep(2000);
			
			String title = driver.getTitle();	
			System.out.println("Title :" +title);
			driver.quit();

	}

}
