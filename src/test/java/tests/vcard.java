package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class vcard {
	
	WebDriver driver=null;
  @Test
  public void f() {
 System.out.println("ssss");
 
 System.out.println("ss");
	
 System.setProperty("webdriver.chrome.driver", "D:\\Users\\ADMIN\\Downloads\\chromedriver.exe");  
 //C:\Users\ADMIN\Downloads\chromedriver-win64\chromedriver-win64
   
      // Instantiate a ChromeDriver class.     
 driver=new ChromeDriver();  
  // Launch Website  
 driver.get("http://www.javatpoint.com/"); 
  }
  
}
