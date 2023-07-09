package Intershala_All_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S8_GetText_and_getTextName_Method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
			driver.navigate().to("https://saucedemo.com");
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("user-name")).click();   
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
			driver.findElement(By.id("login-button")).click();
			String text = driver.findElement(By.xpath("//span[@class='title']")).getText();  // Title Name Products
			if(text.equals("PRODUCTS")) {
				System.out.println("Text Is Matching");
			}
			else {
				System.out.println("Text is Not Matching");
			}
	}

}
