package Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRightNLeft {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  // upcasting
				driver.manage().window().maximize();
				
				driver.get("http://www.album.alexflueras.ro/index.php");
				Thread.sleep(2000);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
			//	js.executeScript("window.scrollBy(0,2000)"); // scroll down pixels
				
			//	Thread.sleep(2000);
				
			//js.executeScript("window.scrollBy(0,-1000)"); // scroll up pixels
				
			Thread.sleep(2000);
				
			js.executeScript("window.scrollBy(5000,0)"); // scroll right pixels
				
			Thread.sleep(2000);
				
			js.executeScript("window.scrollBy(-2000,0)"); // scroll left pixels
				
			Thread.sleep(2000);	
				


}
}




