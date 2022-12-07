package method;

public class Return {
	
	static int Demo() { //user define with int return type
		
		int x= 15;
		int y= 30;
		int z= x+y;
		int d; 
		return d=z;
		
	}

	static String Test() {     //user define with string return type
		return "Welcome to Velocity";
		
	}
	
	public static void main(String[] args) {
		int d= Demo();
		System.out.println(d);
		
		String a = Test();
		System.out.println(a);
	}
}
