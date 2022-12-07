package Collection;

public class Generics2 <R, L> {

	int a;
	R b;
	
	R test(L s) {
		return b;   // Method
		
	
}
	
	public static void main(String[] args) {
		
		Generics<Integer,String> g = new Generics <Integer,String>();
		
		g.a = 66;
		
		g.b = 69;
		
		System.out.println(g.b);
		
	}
}