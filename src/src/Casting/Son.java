package Casting;

public class Son extends Father{   // performing inheritance
	
	public void Bike() {    // property of subclass
		System.out.println("property of Son");
	}
	
	public static void main(String[] args) {
		
		Father x = new Son(); //Upcasting syntax
		
		// Super class reference variable = new Subclass();
		
		x.Car();
		x.Home();
	
	
	
		
	}

}
