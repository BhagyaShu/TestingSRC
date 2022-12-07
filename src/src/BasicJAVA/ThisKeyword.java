package BasicJAVA;

public class ThisKeyword {
	
	int a=10; //Global variable
	
	
	public void Demo() {
		
		int a = 20; //Local variable
		
		System.out.println(a);
		
		System.out.println(this.a);  //Calling Global variable 
		
	}
	
	public static void main(String[] args) {
		
		ThisKeyword x = new ThisKeyword();
		x.Demo();
	}

}
