package Inheritance;

public class Son extends Father {
	
	
	
	public void Bike() {
		System.out.println("BIKE");
		
	}
	
	public  void Mobile() {
		System.out.println("MOBILE");
	}
	
	
	
	public static void main(String[] args) {
		Son x = new Son();
		x.Home();
		x.money();
		x.Car();
		x.Bike();
		x.Mobile();
		System.out.println(x.a);
	}
     
}
