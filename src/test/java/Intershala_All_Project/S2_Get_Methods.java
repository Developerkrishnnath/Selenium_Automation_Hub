package Intershala_All_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2_Get_Methods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		String source = driver.getPageSource();    // the page source is very large that not advisable we should use of page source command 
		
		System.out.println(url + "" + title + " " + source);
		
		if(source.contains("en-IN")) 
		{
			System.out.println("Test is the present in the source code");
		
		}
		else 
		{
			System.out.println("Test is not the present in the source code");
		}
	}

}
