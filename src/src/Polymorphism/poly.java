package Polymorphism;

public class poly {
	
	public static void Addition(int a,int b) {
		System.out.println(a+b);
		
	}
	
	public static void Addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		poly x = new poly();
		x.Addition(10, 20);
		x.Addition(10, 30, 40);
	}

}
