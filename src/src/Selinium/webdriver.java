package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
	    //driver.get("https://www.facebook.com/r.php"); 
		driver.navigate().to("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
		 
		 

}

}