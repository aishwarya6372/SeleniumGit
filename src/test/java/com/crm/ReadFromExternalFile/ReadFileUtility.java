package com.crm.ReadFromExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFileUtility {
	
	public static String propertiesfile(String key) throws IOException {
        Properties prop = new Properties();
		FileInputStream file = new FileInputStream("./ConfigFile2/AddToCart.properties");
		prop.load(file);
		String data = prop.getProperty(key);
		
		
		return data;
	
	}
	
	public static void excelFile() throws EncryptedDocumentException, IOException {
		File path = new File("D:\\AdvancedSeleniunProject\\Dws.xlsx");
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Sheet1");
		String rece_username = sheet.getRow(1).getCell(0).toString();
		String rece_email = sheet.getRow(2).getCell(0).toString();
		String username = sheet.getRow(3).getCell(0).toString();
		String email = sheet.getRow(4).getCell(0).toString();
	}
	
	

}