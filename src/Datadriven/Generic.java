package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic {
	public String getData(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException  {
		@SuppressWarnings("unused")
		String str="";
		FileInputStream fis=new FileInputStream("./Excel/Datadriven.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Cell c = book.getSheet(Sheet).getRow(row).getCell(cell);
		String val = c.getStringCellValue();
		return val;
		
		
	}
}
