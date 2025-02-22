package ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", "D:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
     //C:\Users\ADMIN\Downloads\chromedriver-win64\chromedriver-win64
       
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
      // Launch Website  
     driver.navigate().to("http://www.javatpoint.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  
       

	}

}
