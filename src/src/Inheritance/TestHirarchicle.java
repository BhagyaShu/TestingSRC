package Inheritance;

public class TestHirarchicle {
	
	public static void main(String[] args) {
		
		Son x = new Son();
		x.Bike();
		x.Mobile();
		x.Home();
		x.Car();
	    System.out.println(x.a);
	    
	    System.out.println("Methods from another subclass");
	    
	    Son12 y = new Son12();
	    y.Laptop();
	    y.Car();
	    y.Home();
	    y.money();
	    System.out.println(y.a);
	    
		
		}
	}


