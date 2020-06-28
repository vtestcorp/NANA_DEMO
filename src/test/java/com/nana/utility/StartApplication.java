package com.nana.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class StartApplication {

	public static AndroidDriver driver=null;
	public static WebDriverWait wait;

	@BeforeTest
	public  void init() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "OnePlus 5T");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0.11");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "com.exa.nanamarket.preproduction");
		caps.setCapability("appActivity", "com.exa.nanamarket.SplashActivity");
		caps.setCapability("noReset", "false");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

}