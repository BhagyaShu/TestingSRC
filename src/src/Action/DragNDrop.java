package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  // upcasting
				
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				
				Thread.sleep(3000);
				
				WebElement amt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
				
				WebElement place = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
				
				Actions a = new Actions(driver);
			    a.moveToElement(amt).clickAndHold().moveToElement(place).release().build().perform();
			    
			 //   a.dragAndDrop(amt, place).perform();
				


}
}