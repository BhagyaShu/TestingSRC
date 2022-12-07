package Inheritance;

public class Son12 extends Son {
	
	
	public void Laptop() {
		System.out.println("LAPTOP");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Son12 x = new Son12();
		
		System.out.println(x.a);
		x.Car();
		x.Home();
		x.money();
		x.Bike();
		x.Mobile();
		x.Laptop();
		
	}
	
	
	

}
