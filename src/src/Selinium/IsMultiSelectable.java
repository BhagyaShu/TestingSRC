package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiSelectable {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select ele = new Select(year);
		
		boolean result = ele.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("ListBox is Multiselectable");
			
		}
		
		else {
			System.out.println("ListBox is not Multiselectable");
			
		}
		

}
}