package testClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class MobilePaytm {
	
	public static void main(String[] args) throws Exception{
		File file=new File("/AssistWorkSpace/MavenEclipsePaytm1/src/main/resources/apkFiles/");
		File app=new File(file,"Paytm.apk");
		
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		des.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		des.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//des.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 500);
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		
	}

}
