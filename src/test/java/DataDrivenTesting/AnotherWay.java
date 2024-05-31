package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class AnotherWay {
@Test
	public void AnotherWay() throws EncryptedDocumentException, IOException {
		//path of the file
			File path=new File("C:\\Users\\aishawarya\\Desktop\\Book11.xlsx");
			FileInputStream fis=new FileInputStream(path);
			//trasfer the control to workbook
			
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet("Sheet1");
			int row=sheet.getPhysicalNumberOfRows();
			int column=sheet.getRow(0).getPhysicalNumberOfCells();
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					String s1=sheet.getRow(i).getCell(j).toString();
					System.out.println(s1);
				}
			}
			
	}
}
