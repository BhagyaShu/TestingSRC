package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		driver.get("https://www.facebook.com/r.php");
		
		WebElement male= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		boolean result = male.isSelected();
		
		if (result==true) {
			System.out.println("element is selected");
		}
		else {
			System.out.println("element is not selected");
		}
}
}