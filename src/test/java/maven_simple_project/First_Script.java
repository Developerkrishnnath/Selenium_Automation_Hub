package maven_simple_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Script {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String title =driver.getTitle();
	if(title.equals("Google")) {
	System.out.println("Title Is Correct");	
	
	}
	else {
	System.out.println("Title is incorrect");
	}
	driver.quit();
	}

}
