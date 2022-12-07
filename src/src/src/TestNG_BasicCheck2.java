package src;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_BasicCheck2 {
	

	@BeforeClass
	public void beforeClass() {	
		System.out.println("Before Class is Running");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {	
		System.out.println("Before Method is Running");
		
	}
	
	@Test  (priority = 2)  // Normal Priority
	public void test1() {
		System.out.println("Test1 Method is Running");
		
	}
	
	@Test  (priority = 2)  // Same Priority
	public void test2() {
		System.out.println("Test2 Method is Running");
		
	}
	
	@Test  (priority = 0)  // Default Priority
	public void test3() {
		System.out.println("Test3 Method is Running");
		
	}
	
	@Test  (timeOut = 3000)   // timeout if test case within time then pss otherwise its fail
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


