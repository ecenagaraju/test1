package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ss1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		//DesiredCapabilities cap = new DesiredCapabilities();
		UiAutomator2Options cap = new UiAutomator2Options();
		
		
		 cap.setCapability("deviceName", "Pixel 7 Pro API 35");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); 
		 //cap.setCapability(CapabilityType.VERSION, "5.1");
		  
		
			  
			  System.out.println("sample");
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
			  driver = new  AndroidDriver(url, cap);
			  Thread.sleep(4000);
			    driver.get("https://www.amazon.com");
		
		
		
	}

}
