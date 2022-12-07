package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Shubham");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Borade");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8830026795");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shubbbjn");
		Thread.sleep(2000);
		
		org.openqa.selenium.WebElement x = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select ele = new Select(x);
		
		//ele.selectByIndex(16);
		//ele.selectByValue("25");
		ele.selectByVisibleText("9");
		
		org.openqa.selenium.WebElement y = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select el = new Select(y);
		//el.selectByIndex(5);
		//el.selectByValue("6");
		el.selectByVisibleText("Jun");
		
		org.openqa.selenium.WebElement z = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select a = new Select(z);
		//a.selectByValue("1995");
		a.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"scrollview\"]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/span/span")).click();
		
		
	    
	  
}
}
