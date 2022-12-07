package method;

public class overloading {
	
	static int a=15;
	int b =21;
	
	public static void main(int a) { //user define main method
		System.out.println(a);
		
	}
	
	
	
	public static void main(char x) { //user deine main method
		System.out.println(x);
		
	}
	
	
	public static void main(String[] args) { //system define
		
		main(59869);
		main('$');
	}

}
