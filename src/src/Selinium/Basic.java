package Selinium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		 driver.get("https://www.facebook.com/r.php"); // to launch url & navigate to that page
		 Thread.sleep(3000);
		 
		// driver.close(); // close single tab
		 
		// driver.quit(); // close whole browser
		 
	    String title = driver.getTitle();
		System.out.println(title); // actual title
		 
	    String exptitle = "sign up for facebook | facebook";
		 
	    if(title.equalsIgnoreCase(exptitle)) {
			 System.out.println("Navigated to correct page");
			 
		 }
		 
		 else {
			 System.out.println("Navigated to wrong page");
		 }
		 
		 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/r.php");
	//	Thread.sleep(3000);
		//driver.close();
		//driver.quit();
		 
	
	
	String url = driver.getCurrentUrl();
	
    System.out.println(url);
    
    String expurl ="https://www.facebook.com/r.php";
    
    if(url.equalsIgnoreCase(expurl)) {
    	System.out.println("Navigated to correct page");
    }
    
    else {
    	System.out.println("Navigated to wrong page");
    	
    }

			 
}
}

