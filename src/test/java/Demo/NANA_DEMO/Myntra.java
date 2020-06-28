package Demo.NANA_DEMO;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Myntra {
	
	public static AndroidDriver<MobileElement> driver;
	public static WebDriverWait wait;

	public static void main(String[] ar) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "OnePlus 5T");										
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0.11");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "com.myntra.android");
		caps.setCapability("appActivity", ".SplashActivity t2034");
		caps.setCapability("noReset", "false");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
		
	}
}
