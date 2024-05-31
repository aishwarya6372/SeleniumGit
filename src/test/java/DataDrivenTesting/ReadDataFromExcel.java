package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
@Test
	public void readData() throws EncryptedDocumentException, IOException {
	//path of the file
		File path=new File("C:\\Users\\aishawarya\\Desktop\\Book11.xlsx");
		FileInputStream fis=new FileInputStream(path);
		//trasfer the control to workbook
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		String s1=sheet.getRow(0).getCell(0).toString();
		String s2=sheet.getRow(0).getCell(1).toString();	
		String s3=sheet.getRow(1).getCell(0).toString()	;
		String s4=sheet.getRow(1).getCell(1).toString();
		System.out.println("dws login mail id:"+s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		
		}
}
