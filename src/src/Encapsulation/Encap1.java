package Encapsulation;

public class Encap1 extends Encap {
	
	int p=88;
	
	public void demo() {
		System.out.println(p);
		
	}

	
	public static void main(String[] args) {
		
		Encap1 x = new Encap1();
		x.demo();
		x.Test();
		
		Encap y = new Encap();
		y.Test();
		
		Encap z = new Encap(90,50);
		z.Test();
		
		
		
		
		
	}
	
	

}
