package Intershala_All_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S7_IsDisplyed_and_Selected_Method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
			driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
			
			if(driver.findElement(By.name("newsletter")).isDisplayed()) {          // Subscribe radio butten checked
				if(!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()) {
					driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
					
					
				}
				
			}
			if(driver.findElement(By.name("agree")).isEnabled()) {               // Privacy Policy checked
				driver.findElement(By.name("agree")).click();
			}
	}

}
