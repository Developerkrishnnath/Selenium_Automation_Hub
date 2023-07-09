package Notes_selenium;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Codes_Notes {
	public static void main (String[]args) throws InterruptedException, IOException {
		
		 WebDriver driver=new ChromeDriver(); // set property by maven 
		 
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Desktop\\SADAF MAM IT CLASS-\\shoppingMall\\Intershala\\target\\Driver_Setup\\chromedriver.exe");
	    // WebDriver driver=new ChromeDriver();              
		    
	   // System.setProperty("webdriver.msedge.driver", "C:\\Users\\krish\\Desktop\\SADAF MAM IT CLASS-\\shoppingMall\\Intershala\\target\\Driver_Setup\\msedgedriver.exe");	
	   // WebDriver driver=new EdgeDriver();
			
		 
	        driver.get("https://www.flipkart.com/"); // get commands- open the web page and wait the page open completely.
	        
	        driver.manage().window().maximize(); // for maximize window size
	        
	        Thread.sleep(2000); //  for hold 
	        
	        String url = driver.getCurrentUrl(); // This command fetches the current URL opened in the browser.
	        
	        String title = driver.getTitle(); // This command fetches the title of current page.
	        
	        String source = driver.getPageSource(); // This command return the source code of the page.
	        
	        System.out.println(url + " " + title + " " + source); // Print get command- line No. 11,13,15
	        
	        driver.close(); // This command closes the current browser window.
	        
	        driver.quit(); // This command closes all browser windows opened by web driver.------(recommended to use)
	        
			driver.navigate().to("https://www.google.com"); // navigate commands- use to navigate to a web page URL. use for between to web site
			
			Thread.sleep(3000);  // stop the execution of the script for the specific duration.
			
			driver.navigate().to("https://www.facebook.com");
			
			driver.navigate().forward(); // Navigate command, navigate the browser forward by one page.
			
			driver.navigate().back(); // Back, command navigate the browser to immediate previous page.
			
			driver.navigate().refresh(); // refresh This command reload the current web page.
			
			driver.findElement(By.id("user_name")).sendKeys("krish@gmail.com"); // This command simulates typing into elements, to set it's value.
			
			driver.findElement(By.id("user_name")).clear();  // This method clear out the values within a element.
			
			driver.findElement(By.name("login_button")).click(); // Click, command simulates the click event on any element.
			
			driver.switchTo().frame("moneyiframe"); // for i frame send our name 
			
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                               // for take screenshot 
			FileUtils.copyFile(screenshotFile, new File ("D:\\Software testing\\Screenshort\\screenshot_visiblePage.png")); // for take screenshot 
	}
}
