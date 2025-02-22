package ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class video1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ss");
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Users\\ADMIN\\Downloads\\chromedriver.exe");  
	     //C:\Users\ADMIN\Downloads\chromedriver-win64\chromedriver-win64
	       
	          // Instantiate a ChromeDriver class.     
	     WebDriver driver=new ChromeDriver();  
	      // Launch Website  
	     driver.get("http://www.javatpoint.com/");  
	       
	      //Maximize the browser  
	       driver.manage().window().maximize();  
	       


	}

}
