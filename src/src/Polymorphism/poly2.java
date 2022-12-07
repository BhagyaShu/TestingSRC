package Polymorphism;

public class poly2 {
	
	public void Subtraction(int a,int b) {
		System.out.println(a-b);
	}
	
	public void subtraction(int a, int b,int c) {
		System.out.println(a-b-c);
	}
	
	public static void main(String[] args) {
		poly2 x = new poly2();
		x.Subtraction(20, 10);
		x.subtraction(100, 50, 20);
	}

}
