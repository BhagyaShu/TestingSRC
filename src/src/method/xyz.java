package method;

public class xyz {

	public static void Sample() { //static method decleration
		System.out.println("Running static method Sample");
	}
	
	public static void Sample1() { 
		System.out.println("Running static method Sample1");
		
	}
	
	public static void main(String[] args) {
		Sample1();  //static method calling from same class
	}
}
