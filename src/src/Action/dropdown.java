package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
	   WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	   
	   Actions a = new Actions(driver);
	   
	   a.moveToElement(login).perform();
	   
	   WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));
	   
	  // a.contextClick(orders).perform();
	   a.click(orders).perform();
		
		
		
		
		
	}
	
	

}
