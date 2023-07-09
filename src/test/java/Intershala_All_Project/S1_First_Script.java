package Intershala_All_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1_First_Script {
	public static void main(String[]args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
     	driver.manage().window().maximize();
     	
     	String title = driver.getTitle();  // for store the current title, the verify the title in the current page
     
     	if(title.equals("Google"))         // verify the current page title is correct or not
     	{
     		System.out.println("Title Is Correct");
     	}
     	else 
     	{
     		System.out.println("Title Is Incorrect");
     	}
     	driver.quit();                  // close the driver 
	}

}
