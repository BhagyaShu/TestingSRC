package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
		
		String cwid = al.get(2);  //get adress of child window
		
		driver.switchTo().window(cwid); //focus is on child window
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		driver.switchTo().window(al.get(0)); //focus is change to main window
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
		
		

}
}