package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {
	
		public static String read(String sheetname,int i, int j) throws IOException{
		File file =new File("C:\\Users\\kudsit\\eclipse-workspace\\e_Samrudha\\src\\main\\resources\\Excel Read.xlsx");//creating an object of File class to open xls file
		FileInputStream fis= new FileInputStream(file);//creating an object of fileInputstream to read excel file
		XSSFWorkbook wb=new XSSFWorkbook(fis);//creating workbook instance that refers to  .xls file
		XSSFSheet sheet=wb.getSheet(sheetname);//creating a sheet object
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();//get all rows in sheet
		
		Row r = sheet.getRow(i);
		Cell c = r.getCell(j);
		return c.getStringCellValue();

		}

	}


