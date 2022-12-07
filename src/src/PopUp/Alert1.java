package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		Thread.sleep(5000);
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Shubham");
		alt.accept();
		
		
		
}
}