package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New3 {
  @Test
  public void f() {
	  
	  //129.0.6668.71 crome driver version
	  System.out.println("sneha");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");  
	  System.out.println("sssss");
	  WebDriver driver=new ChromeDriver();  
      // Launch Website  
     driver.get("http://www.javatpoint.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize(); 
	  //website
       
  }
}
