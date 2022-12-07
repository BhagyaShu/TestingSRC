package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCellType {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shubham\\Documents\\Book1.xlsx");
		
	//	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		CellType CT = WorkbookFactory.create(file).getSheet("Sheet1").getRow(14).getCell(7).getCellType();
		
		System.out.println(CT);
	}

}
