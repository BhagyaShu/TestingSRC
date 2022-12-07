package method;

public class methodoverloading {
	
	static void Sum(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}
	static void Sum(int a,float b) {
		int x = a;
		float y = b;
		float c = a*b;
		
		System.out.println("multiplication="+c);
	}

	static void Sum(String w) {
		System.out.println(w);
	}
	static void Sum(char s) {
		System.out.println(s);	
	}
	
	static void Sum(int g,double j) {
		int n = g;
		double m= j;
		double h= j/g;
		
		System.out.println("division ="+h);
		
	}
	
	public static void main(String[] args) {
		methodoverloading q =new methodoverloading ();
		q.Sum(5,5,2);
		q.Sum(5,6f);
		q.Sum("Raja");
		q.Sum('&');
		q.Sum(60, 5);
		
		
		
		
	}
	
}
