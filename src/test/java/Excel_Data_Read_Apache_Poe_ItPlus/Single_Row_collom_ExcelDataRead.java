package Excel_Data_Read_Apache_Poe_ItPlus;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Single_Row_collom_ExcelDataRead 

{
 public void dataread() 
 {
	 try
	 {
 
 FileInputStream fs=new FileInputStream("C:\\Users\\krish\\Desktop\\IT PLUS\\user.xlsx");
 
 XSSFWorkbook workbook=new XSSFWorkbook(fs);
 XSSFSheet objsheet=workbook.getSheetAt(0);
 XSSFRow row=objsheet.getRow(0);
	
 String value=row.getCell(0).getStringCellValue();
 System.out.println(value);
 workbook.close();
			 fs.close();

 }
	 catch (Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 public static void main(String[]args)
 {
	 Single_Row_collom_ExcelDataRead  obj=new Single_Row_collom_ExcelDataRead ();
	 obj.dataread();
 }
}

