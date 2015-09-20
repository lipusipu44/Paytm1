package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookSearch {
	
	@Test
	public void googleLink() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
	}

}
