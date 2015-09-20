package testClasses;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ApiDemo {
	public static void main(String[] args) throws Exception{
		File file=new File("/AssistWorkSpace/MavenEclipsePaytm1/src/main/resources/apkFiles/");
		File app=new File(file,"apiDemos.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 400);
		cap.setCapability("platformVersion", "4.4.2");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.scrollTo("View");
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Views\")").click();
		driver.scrollTo("Seek Bar").click();
		
		//driver.sendKeyEvent(AndroidKeyCode.HOME);
		
		MobileElement seekBar=(MobileElement) driver.findElementById("com.example.android.apis:id/seek");
		TouchAction t=new TouchAction(driver);
		//seekBar.swipe(SwipeElementDirection.LEFT, 4);
		//t.tap(seekBar, 320, 400).perform();
		//t.longPress(seekBar, 0, 0).moveTo(seekBar, 160, 0).perform();
		//t.press(seekBar).moveTo(seekBar, 320, 0).perform();
		//t.longPress(seekBar).moveTo(160, 0);
		
		/*WebElement seekBar=driver.findElementById("com.example.android.apis:id/seek");
		TouchAction t=new TouchAction(driver);
				//seekBar.swipe(SwipeElementDirection.LEFT, 4);
		t.longPress(seekBar, 0, 0).moveTo(seekBar, 160, 0).perform();*/
		
	}
}
