package Selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		//driver.get("https://www.facebook.com/r.php");
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
       
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Type casting
       
       File destination = new File("G:\\software testing\\Screenshots\\test01.jpg");
       
       FileHandler.copy(src, destination);
       
     
       
       
       
     

}
}