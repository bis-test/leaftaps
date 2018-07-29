package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadLeadExcel {

	public Object[][] readExcel() throws IOException {
		

		
		XSSFWorkbook wbook= new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum= sheet.getRow(0).getLastCellNum();
		
		Object[][] data= new Object[lastRowNum][lastCellNum];
		
		System.out.println("Row count= "+lastRowNum+"Column count="+lastCellNum);
		
		for (int i=1; i<=lastRowNum; i++)
		{
			XSSFRow row= sheet.getRow(i);
			
			for (int j=0; j<lastCellNum; j++)
			{
				String value = row.getCell(j).getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}
		}

	     wbook.close();
		return data;
	}

	
	public static void main(String args[]) throws IOException  {
		ReadLeadExcel DT = new ReadLeadExcel();
		DT.readExcel();
	}
}
