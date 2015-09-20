package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookPageObject {

	public void pageCaller(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
}
