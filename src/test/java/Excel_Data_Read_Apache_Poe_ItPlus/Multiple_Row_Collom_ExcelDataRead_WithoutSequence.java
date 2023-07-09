package Excel_Data_Read_Apache_Poe_ItPlus;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiple_Row_Collom_ExcelDataRead_WithoutSequence {

	public void dataread()
	{
		try 
		{
			FileInputStream fs=new FileInputStream("C:\\Users\\krish\\Desktop\\IT PLUS\\user.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fs);
			XSSFSheet objsheet=workbook.getSheetAt(0);
			int rowCount=objsheet.getLastRowNum();
			
			
			for(int a=0; a<=rowCount;a++)
			{
				XSSFRow row=objsheet.getRow(a);
				int cellcount=row.getLastCellNum();
				
				for(int b=0; b<cellcount;b++)
				{
					String value=row.getCell(b).getStringCellValue();
					System.out.println(value);
				}
				
			}
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
		Multiple_Row_Collom_ExcelDataRead_WithoutSequence obj=new Multiple_Row_Collom_ExcelDataRead_WithoutSequence();
		obj.dataread();
	}
}
