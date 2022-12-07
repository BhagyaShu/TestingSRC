package Casting;

public class Explicit { // explicit casting data loss
	
	public static void main(String[] args) {
		
		double a = 130.75; // memory size is 8 byte
		
		System.out.println(a);
		
		int b = (int)a; // casting operator and memory size is 4 byte
		
		System.out.println(b);
		
		byte c = (byte)b;  //memory size is 1 byte
		
		System.out.println(c);
		
		}

}
