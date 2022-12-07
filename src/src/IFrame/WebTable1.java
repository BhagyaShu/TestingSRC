package IFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> noofRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		//total number of rows present in table
		
		System.out.println("No of Rows = "+noofRows.size());
		
		for(int i =1;i<noofRows.size();i++) {
			List<WebElement> noofCells = driver.findElements(By.xpath("//table[@id='product']//tr["+(i+1)+"]//td"));
			System.out.print(noofCells.size()+") ");
			
			for(int cell =0;cell<noofCells.size();cell++) {
				System.out.print(noofCells.get(cell).getText()+" , ");
				
			}
			System.out.println();
			
		}
		
		
		
		

}


}