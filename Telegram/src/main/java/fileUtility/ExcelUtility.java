package fileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//	Data Driven framework 
public class ExcelUtility {

	public static String getCellData(String sheetName, int row, int cell) throws IOException  
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/Book.xlsx");
		
		//Workbook book = WorkbookFactory.create(fis);
		
		//Sheet sheet = book.getSheet("Sheet1");
		
		//Row row = sheet.getRow(2);
		
		//Cell cell = row.getCell(0);
		
		//String value = cell.getStringCellValue();
		//System.out.println(value);
		
		//return value;
		
		
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(row).getCell(cell).toString();
}
	
	
	public static String[][] readExcelData(String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/Book.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data = new String[rowCount-1][cellCount];
		
		//To read the datas
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		//To pass the datas
		for(int i=0;i<rowCount-1;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				System.out.print(data[i][j]+",");
			}
			System.out.println();
		}
		
		return data;
	}
	public static void main(String[] args) throws IOException {
		readExcelData("Sheet1");
	}
}
