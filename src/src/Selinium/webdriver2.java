package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver2 {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		//driver.navigate().to("https://www.facebook.com/r.php");
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_3a9c453d-c106-487f-84e0-5f3a8e220787_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
        driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/lifestyle-big-dussehra-days-store?fm=neo%2Fmerchandising&iid=M_aa1728a2-e604-4685-b6f3-7391a84644a7_1_ZTJ2HI685DLY_MC.CPZ5PBSAJQKR&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Fashion_CPZ5PBSAJQKR&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L0_view-all&cid=CPZ5PBSAJQKR");
		

}
}
