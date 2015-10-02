package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utilPackages.Log;

public class FacebookSearch {
	
	@Test
	public void googleLink() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		Log.info("FB message checked");
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		System.out.println("printing the git message");
	}

}
