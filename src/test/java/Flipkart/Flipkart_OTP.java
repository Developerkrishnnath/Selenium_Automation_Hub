package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_OTP {
	
	public static void main (String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		    // send opt 
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8839324253");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		
	        // otp field 
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("9");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("3");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[3]/input")).sendKeys("6");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[4]/input")).sendKeys("9");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[5]/input")).sendKeys("3");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[6]/input")).sendKeys("5");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/button")).click();
		 
	}
	

}
