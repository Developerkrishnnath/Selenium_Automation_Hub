package Excel_Data_Read_Apache_Poe_ItPlus;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multiple_Row_Collom_ExcelDataRead_Sequence {

	public static void main(String[] args) {
        String excelFilePath = "C:\\Users\\krish\\Desktop\\IT PLUS\\user.xlsx";

        try (FileInputStream fis = new FileInputStream(excelFilePath)) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet("Sheet1"); // Replace "Sheet1" with your sheet name

            int rowCount = sheet.getLastRowNum();
            for (int i = 0; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(0); // Assuming the string data is in the first column

                String value = cell.getStringCellValue();
                System.out.println("Value: " + value);
            }
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
	
}
