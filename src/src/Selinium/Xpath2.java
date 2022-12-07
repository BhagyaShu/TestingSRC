package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		driver.get("https://www.whatsapp.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"top-of-page\"]/div[1]/div[1]/div[1]/header/div/div[2]/span[1]/a[1]/span/h5")).click();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[1]/div/a")).click();
		

}
}
