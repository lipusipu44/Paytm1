package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookSearch {
	
	@Test
	public void googleLink(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

}
