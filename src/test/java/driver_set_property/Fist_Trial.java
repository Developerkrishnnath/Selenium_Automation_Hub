package driver_set_property;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Fist_Trial {

	public static void main(String[] args) {
   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Desktop\\SADAF MAM IT CLASS-\\shoppingMall\\Intershala\\target\\Driver_Setup\\chromedriver.exe");
   //WebDriver driver=new ChromeDriver();
    
	System.setProperty("webdriver.msedge.driver", "/iT_Plus_Selenium_Automation/target/Driver_Setup/chromedriver.exe");	
	WebDriver driver=new EdgeDriver();
	
		driver.get("https://www.google.com/");
	}

}
