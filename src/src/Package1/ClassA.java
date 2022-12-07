package Package1;

public class ClassA {
	
	public int a=10;
	
	private int b=20;
	
	int c=30;
	
	protected int d=40;
	
	public static void main(String[] args) {
		
		ClassA x = new ClassA();
		
		
		System.out.println(x.a); //calling variable with public access specifier
		System.out.println(x.b); //calling variable with private access specifier
		System.out.println(x.c); //calling variable with default access specifier
		System.out.println(x.d); //calling variable with protected access specifier
		
	}
	
	
	

}
