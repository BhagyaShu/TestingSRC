package method;

public class ParameterMethod {
	
	public static void Addition(int x, int y) {
		
		int z =x+y;
		System.out.println("Addition ="+ z);
		
	}
	
	public void Multiplication (int a, int b) {
		
		int c = a*b;
		System.out.println("Multiplication="+ c);
		
	}
	public static void main(String[] args) {
		
		Addition(70,70);
		Addition(50,20); 
		
		ParameterMethod s = new ParameterMethod();
		
		s.Addition(30,20);
		s.Multiplication(60, 5);
		s.Multiplication(50, 7);
	}

}
