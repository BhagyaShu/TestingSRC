package Polymorphism;

public class Ride2 extends Ride{
	
	public static void Test() {
		System.out.println("Run Test method  of sub class");
	}
	
	public static void main(String[] args) {
		
		Ride2 x= new Ride2();
		x.Test();
		
	}
}
