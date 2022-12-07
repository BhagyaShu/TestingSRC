package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringValue1 {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shubham\\Documents\\Book1.xlsx");
		
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(11).getCell(6).getNumericCellValue();
		
		System.out.println(data);
	}

}


