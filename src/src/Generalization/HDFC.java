package Generalization;

public class HDFC implements ATM {
	
	public void withdrawl() {
		System.out.println("Daily limit exceeds to 20,000Rs");
	}
	
	public void pinchange() {
		System.out.println("2 Times in a month to change a pin");
	}
	
	public void ministatement() {
		System.out.println("10 times per day for Ministatement");
		
	}
	
	public void BalanceEnquiry() {
		System.out.println("BalEnq 5 times in a day");
	}

}
