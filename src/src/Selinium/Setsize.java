package Selinium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		//driver.navigate().to("https://www.facebook.com/r.php");
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		Dimension d = new Dimension(300,300);  // pixels
		
		driver.manage().window().setSize(d);

}
}
