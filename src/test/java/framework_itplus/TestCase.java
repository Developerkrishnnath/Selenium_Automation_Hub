package framework_itplus;

import org.testng.annotations.Test;
//import org.openqa.selenium.By;

public class TestCase extends Utility
{
   ObjectRepository objr= new ObjectRepository ();
   
   @Test(priority=1)
   
   public void inintdriver()
   {
	   driversetting();
   }
   
   @Test(priority=2)
   public void nagative()
   {
	  
	   driver.findElement(objr.emailtextbox).sendKeys("testing");
   }
   
}
