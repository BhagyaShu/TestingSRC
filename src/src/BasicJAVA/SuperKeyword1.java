package BasicJAVA;

public class SuperKeyword1 extends SuperKeyword{
	
	int a=40; //Global Variable
	
	public void Test() {
		
		
		int a=50; //Local variable
		
		System.out.println(a); // local variable 50
		System.out.println(this.a); // calling Global  variable from same class 40
		System.out.println(super.a); // calling Global variable from diff class 30
		
	}
	
	public static void main(String[] args) {
		
		SuperKeyword1 x = new SuperKeyword1();
		x.Test();
		
	}

}
