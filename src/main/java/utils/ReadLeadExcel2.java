package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadLeadExcel2 {


		public Object[][] readExcel() throws IOException  {
				XSSFWorkbook wBook = new XSSFWorkbook("./data/CreateLead.xlsx");
				XSSFSheet sheet = wBook.getSheetAt(0);
				int rowNum = sheet.getLastRowNum();
				int colNum = sheet.getRow(0).getLastCellNum();
				Object[][] data = new Object[rowNum][colNum];
				System.out.println("row count :"+rowNum+" cell count :"+colNum);
				for (int i = 1; i <= rowNum; i++) {
					XSSFRow row = sheet.getRow(i);
					for (int j = 0; j < colNum; j++) {
						String value = row.getCell(j).getStringCellValue();
						data[i-1][j]=value;
						System.out.println(value);
					}
				}
				wBook.close();
				return data;
		}
	
}

