package Demo.NANA_DEMO;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	public static AndroidDriver<MobileElement> driver;
	public static WebDriverWait wait;

	public static void main(String[] ar) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "OnePlus 5T");										
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0.11");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "com.oneplus.calculator");
		caps.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		caps.setCapability("noReset", "false");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
		driver.findElement(By.id("com.oneplus.calculator:id/digit_7")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/op_add")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/digit_3")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
		

	}
}
