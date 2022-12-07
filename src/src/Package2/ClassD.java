package Package2;

import Package1.ClassA;

public class ClassD extends ClassA {
	
	public static void main(String[] args) {
		
		ClassD q = new ClassD();
		
		System.out.println(q.a); //calling variable with public access specifier
	//	System.out.println(q.b); //calling variable with private access specifier
	//	System.out.println(q.c); //calling variable with default access specifier
		System.out.println(q.d); //calling variable with protected access specifier
		
	}

}
