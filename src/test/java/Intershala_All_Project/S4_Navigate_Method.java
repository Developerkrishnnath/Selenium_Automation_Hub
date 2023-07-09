package Intershala_All_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4_Navigate_Method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");    // first  driver it will take google page
		driver.navigate().to("https://www.gmail.com");     // then will go to g-mail page
		driver.navigate().back();                          // whenever will back command again switch to google page
		driver.navigate().forward();                       // then again move forward the g-mail page
		driver.navigate().refresh();                       // after that page will refresh.

	}

}
