package framework_itplus;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	WebDriver driver;
	String browsername;
	String applicationlink;
	
	public void driversetting()
	// reading browser name and link from excel 
	{
		try
		{
			FileInputStream fs=new FileInputStream("C:\\Users\\krish\\Desktop\\IT PLUS\\user.xlsx");
			
			XSSFWorkbook work=new XSSFWorkbook (fs);
			FileInputStream workbook = null;
			XSSFSheet sheet=(XSSFSheet) ((Workbook) workbook).getSheet("Sheet2");
			XSSFRow row=sheet.getRow(1);
			browsername=row.getCell(0).getStringCellValue();
			applicationlink=row.getCell(1).getStringCellValue();
			
			
			
			workbook.close();
			fs.close();


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// opening browser bases upon browser name given in excel
		
	    if (browsername.equalsIgnoreCase("maven"))
	    {
	    	WebDriver driver=new ChromeDriver();
	    }
	    
	    else if (browsername.equalsIgnoreCase(""))
	    {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Desktop\\SADAF MAM IT CLASS-\\shoppingMall\\Intershala\\target\\Driver_Setup\\chromedriver.exe");
	    driver=new ChromeDriver();
	    }
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
	    driver.get(applicationlink);
	    
	}
	    public WebElement empElement(By objby)
	    {
	   
	    	WebElement temp=driver.findElement(objby);
	    	return temp;
	    	
	    }
	    
	    public static void main(String[] args)
	    {
		
	    	 Utility obj=new  Utility();
	    	 obj.driversetting();
		}
	
}
