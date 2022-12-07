package Generalization;

public class GeneralizationATM {
	
	
	public static void main(String[] args) {
		
		System.out.println("**************Specification of SBI ATM*************");
		
		SBI x = new SBI();
		x.withdrawl();
		x.pinchange();
		x.ministatement();
		x.BalanceEnquiry();
		
		System.out.println("**************Specification of HDFC ATM*************");
		
		HDFC y = new HDFC();
		y.withdrawl();
		y.pinchange();
		y.ministatement();
		y.BalanceEnquiry();
		
		System.out.println("**************Specification of AXIS ATM*************");
		
		AXIS z = new AXIS();
		z.withdrawl();
		z.pinchange();
		z.ministatement();
		z.BalanceEnquiry();
		z.Banking();
		
		
	}

}
