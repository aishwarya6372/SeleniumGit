package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataExcel {
@Test
	public void writedata() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\aishawarya\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		Cell cell=row.createCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("Deshpande");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\aishawarya\\Desktop\\Book1.xlsx");
		wb.write(fos);
		wb.close();
	}
}
