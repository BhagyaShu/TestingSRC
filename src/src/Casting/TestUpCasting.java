package Casting;
public class TestUpCasting {
	
	public static void main(String[] args) {
		
		System.out.println("**************With Super Class object***************");
		
		UpCasting x = new UpCasting();
		x.demo();
		x.Static();
		x.Set();
		UpCasting.Static();
		
		
		System.out.println("**************With Sub Class object***************");
		
		UpCasting1 y = new UpCasting1();
		y.demo();
		y.Set();
		y.Sub();
		y.Static();
		
		
		System.out.println("**************With UpCasting ***************");
		
		UpCasting z = new UpCasting1();  // Upcasting
		z.demo();
		z.Set();
		z.Static();
		
		
		System.out.println("**************With DownCasting***************");
	
		UpCasting1 cr = (UpCasting1) new UpCasting();   // DownCasting Syntax
		cr.demo();
		cr.Set();
		cr.Sub();
		cr.Static();
	
	
	}
	
	
	

}
