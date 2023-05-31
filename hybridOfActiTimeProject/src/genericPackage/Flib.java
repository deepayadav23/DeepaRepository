package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//It is use store generic reusable methods
	public String readExcelData(String excelpath,String sheetName, int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}

	public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}

	//write Excel Data
	public void writeExcelData(String excelpath,String sheetName,int rowCount,int cellCount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sheet = wb.getSheet(sheetName); 
		Row row = sheet.getRow(rowCount); 
		Cell cell = row.createCell(cellCount);

		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}


	//To read property data
	public String readPropertyData(String propertyPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propertyPath);
		Properties prop = new Properties();
		prop.load(fis);

		String data = prop.getProperty(key);
		return data;
	}

	//generalise cell count
	public short cellCount(String excelpath,String sheetName, int rowCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		short cc = row.getLastCellNum();
		return cc;
	}

}

