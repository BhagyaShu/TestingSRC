package Action;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpNDown {
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();  // upcasting
					driver.manage().window().maximize();
					
					driver.get("https://vctcpune.com/");
					Thread.sleep(2000);
					
					JavascriptExecutor js = (JavascriptExecutor)driver;
					
					js.executeScript("window.scrollBy(0,2000)"); // scroll down pixels
					
					Thread.sleep(2000);
					
				js.executeScript("window.scrollBy(0,-1000)"); // scroll up pixels
					
				//hread.sleep(2000);
					
				//s.executeScript("window.scrollBy(1000,0)"); // scroll right pixels
					
				//hread.sleep(2000);
					
				//s.executeScript("window.scrollBy(-2000,0)"); // scroll left pixels
					
				//hread.sleep(2000);	
					


	}
	}


