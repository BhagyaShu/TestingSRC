package Generalization;

public class TestGeneralization {

	public static void main(String[] args) {
		
		
		System.out.println("**************Specification of Jio Operator*************");
		
		Jio x = new Jio();
		x.calling();
		x.SMS();
		x.Data();
		x.PrimeMember();
		
		System.out.println("**************Specification of VI Operator*************");
		
		VI y = new VI();
		y.calling();
		y.SMS();
		y.Data();
		
		System.out.println("**************Specification of Airtel Operator*************");
		
		Airtel z = new Airtel();
		z.calling();
		z.SMS();
		z.Data();
		z.AirtelBank();
	}
}
