package Casting;

public class UpCasting1 extends UpCasting {
	
	public void demo() { // override method
		System.out.println("Non Static method of Sub class");
		
	}
    public void Set() {  // override method
    	System.out.println("Non static method of Set sub class");
    	
    }
    
    public void Sub() {
    	System.out.println("Sub Class method running");
    }
}
