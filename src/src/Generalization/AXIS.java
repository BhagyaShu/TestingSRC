package Generalization;

public class AXIS implements ATM{
	
	public void withdrawl() {
		System.out.println("Daily limit exceeds to 50,000Rs");
	}
	
	public void pinchange() {
		System.out.println("8 Times in a month to change a pin");
	}
	
	public void ministatement() {
		System.out.println(" Ministatement is limited to 15 times in month");
		
	}
	
	public void BalanceEnquiry() {
		System.out.println("BalEnq 20 times in a day");
	}
	
	public void Banking() {
		System.out.println("Get all Services");
	}

}
