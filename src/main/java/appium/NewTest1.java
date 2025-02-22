package appium;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	
	WebDriver driver;
	//DesiredCapabilities cap = new DesiredCapabilities();
	UiAutomator2Options cap = new UiAutomator2Options();
	
	//code
  @Test
  public void f() throws InterruptedException, MalformedURLException {
	  
	  System.out.println("sample");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	  driver = new AndroidDriver(url, cap);
	  Thread.sleep(4000);
	    driver.get("https://www.amazon.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  cap.setCapability("deviceName", "Pixel 7 Pro API 35");
	  cap.setCapability("platformName", "Android");
	  cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); 
	 //cap.setCapability(CapabilityType.VERSION, "5.1");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
