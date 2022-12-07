package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		driver.get("https://www.facebook.com");
		
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shubhamborade947@gmail.com");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shubh@m95");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[@value='1']")).click();
	
		
		
		

}
}