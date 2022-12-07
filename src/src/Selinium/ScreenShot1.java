package Selinium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {
	
public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		//driver.get("https://www.facebook.com/r.php");
		driver.get("https://www.Myntra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		DateTimeFormatter date = new DateTimeFormatter.ofPattern("yyyy-MM-dd HH mm ss");
		LocalDateTime now = LocalDateTime.now();
       
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Type casting
       
       File destination = new File("G:\\software testing\\Screenshots\\test1.jpg");
       
       FileHandler.copy(src, destination);
       
     
       
}
}
