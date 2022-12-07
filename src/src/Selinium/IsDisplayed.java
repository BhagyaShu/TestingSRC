package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		driver.get("https://www.facebook.com/r.php");
		
		WebElement display= driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		
		boolean result = display.isDisplayed();
		
		System.out.println(result);
		
		if (result==true) {
			System.out.println("elment is displayed");
		}
		else {
			System.out.println("elment is not displayed");
		}
		
		

}
}