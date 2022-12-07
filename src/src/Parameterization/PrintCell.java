package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCell {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shubham\\Documents\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastrowindex = sh.getLastRowNum();
		
		for(int i = 0;i<=lastrowindex;i++) {
			
			String data = sh.getRow(i).getCell(0).getStringCellValue();
			
			
			System.out.println(data);
			
			
		}
		
		
		
}		
		
		
	}


