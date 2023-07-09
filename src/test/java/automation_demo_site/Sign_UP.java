package automation_demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_UP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		
		w.get("https://demo.automationtesting.in/");
		
		 /*   w.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
			w.findElement(By.xpath("/html/body/div/div/div[2]/input")).sendKeys("krishyaduwan13@gmail.com");
			w.findElement(By.xpath("/html/body/div/div/div[3]/input")).sendKeys("Krish@123");
			w.findElement(By.xpath("//*[@id=\"enterbtn\"]")).click();  */
			
			
			w.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();
		}

}
