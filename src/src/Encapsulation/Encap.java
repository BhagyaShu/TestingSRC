package Encapsulation;

public class Encap {
	
	private int a = 10;
	private int b = 20;
	
	Encap() {
		
		a=34;
		b =65;
		
	}
	
	Encap(int c,int d) {
		
		a = 90;
		b = 50;
	}
	
	public void Test() {
		int c = a+b;
		System.out.println(c);
		
	}
	

}
