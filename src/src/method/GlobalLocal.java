package method;

public class GlobalLocal {
	
	int a= 20; //Global variable declared outside the method
	
	public void Test() {
		
		int b = 88;  //local variable declared inside method
		int a=35;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void Test1() {
		int c = 50; //local variable inside method
		int b=60;
		
		System.out.println(a); //Global variable printing
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		GlobalLocal x = new GlobalLocal();
		
		System.out.println(x.a);
		
		x.Test(); //88,35
		x.Test1(); //20,60,50
	}

}
