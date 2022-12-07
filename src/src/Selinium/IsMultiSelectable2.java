package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiSelectable2 {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		WebElement Brand =driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[1]"));
		
         Select ele = new Select(Brand);
		
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