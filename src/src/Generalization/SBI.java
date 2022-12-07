package Generalization;

public class SBI implements ATM {
	
	public void withdrawl() {
		System.out.println("Daily limit exceeds to 40,000Rs");
	}
	
	public void pinchange() {
		System.out.println("4 Times in a month to change a pin");
	}
	
	public void ministatement() {
		System.out.println("Unlimited Ministatement");
		
	}
	
	public void BalanceEnquiry() {
		System.out.println("BalEnq 2 times in a day");
	}

}
