package Selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class multipleScreenshot {
	
public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting //browser launch
		//driver.get("https://www.facebook.com/r.php");
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		for(int i = 5;i>1;i--) {
       
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Type casting
       
       String random = RandomString.make(2);
	File destination = new File("G:\\software testing\\Screenshots\\Demo20"+random+".jpg"); //concatination
       
       FileHandler.copy(src, destination);
		}
       

}
}