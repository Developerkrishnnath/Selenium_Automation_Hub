package automation_demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Regestration_Page {
	 public static void main(String[] args) {
	WebDriver w=new ChromeDriver();
	
	
	w.manage().window().maximize();
	w.get("https://demo.automationtesting.in/Register.html");

 	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Krish");
	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Yaduwanshi");
	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Chhindwara,MP");
	w.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("krishyaduwan13@gmail.com");
	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8839324253");
	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
	w.findElement(By.id("checkbox1")).click();
	w.findElement(By.id("checkbox2")).click();
	
	w.findElement(By.id("msdd")).click();   // Language 
	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a")).click();
	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
	w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();
	w.findElement(By.id("Skills")).click();
	
	w.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
	w.findElement(By.xpath("//*[@id=\"Skills\"]")).sendKeys("JAVA");
	
	w.findElement(By.id("countries")).click();
	w.findElement(By.xpath("//body/section[@id='section']/div[1]")).click();
	
	w.findElement(By.className("select2-selection__arrow")).click();
    w.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
    
    WebElement Year = w.findElement(By.id("yearbox"));
    Select select = new Select(Year);
    select.selectByValue("1994");
    
    WebElement Month = w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    Select select2 = new Select(Month);
    select2.selectByValue("August");
    
    WebElement Date = w.findElement(By.id("daybox"));
    Select select3 = new Select(Date);
    select3.selectByValue("13");
    
  WebElement firstpassword =  w.findElement(By.id("firstpassword"));
  firstpassword.sendKeys("Pass@123");
  w.findElement(By.id("secondpassword")).sendKeys("Pass@123");
  
//  w.findElement(By.id("submitbtn")).click(); */
	 }
}

