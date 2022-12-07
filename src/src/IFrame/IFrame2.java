package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {

public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		
         driver.switchTo().frame(iframe); // change focus from main page to iframe
		
		driver.findElement(By.xpath("//div[@class='popup']")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().defaultContent(); // change focus from Iframe to main page
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();


		
}
}