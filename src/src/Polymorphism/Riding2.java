package Polymorphism;

public class Riding2 extends Riding {
	
	public void addition() {
		System.out.println("Addition ended");
	}
	
	public void subtraction() {
		System.out.println("Subtraction ended");
	}

	public static void main(String[] args) {
		Riding x = new Riding2();
		x.addition();
		x.subtraction();
		
	}
	
}
	
