package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataUsingCT {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shubham\\Documents\\Book1.xlsx");
		
		//Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(13).getCell(4);
		
		CellType CT= cellinfo.getCellType(); //String or boolean or Numeric
		
		if(CT == CellType.STRING) {
			System.out.println(cellinfo.getStringCellValue());
			
		}
		
		else if(CT== CellType.BOOLEAN) {
			System.out.println(cellinfo.getBooleanCellValue());
			
			
		}
		
		else if(CT == CellType.NUMERIC) {
		System.out.println(cellinfo.getNumericCellValue());
		}
		
	}
}
