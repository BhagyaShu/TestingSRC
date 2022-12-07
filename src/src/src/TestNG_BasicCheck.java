package src;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_BasicCheck {   // Normal Priority
	
	
	@BeforeClass
	public void beforeClass() {	
		System.out.println("Before Class is Running");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {	
		System.out.println("Before Method is Running");
		
	}
	
	@Test  (enabled = false)  // Normal Priority  // enabled 
	public void test1() {
		System.out.println("Test1 Method is Running");
		
	}
	
	@Test  (priority = 4)
	public void test2() {
		System.out.println("Test2 Method is Running");
		
	}
	
	@Test  (priority = -1)  // Negative Priority
	public void test3() {
		System.out.println("Test3 Method is Running");
		
	}
	
	@Test  (priority = 3)
	public void test4() {
		System.out.println("Test4 Method is Running");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method is Running");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class is Running");
	
	
	
		
		
	
	

}
}