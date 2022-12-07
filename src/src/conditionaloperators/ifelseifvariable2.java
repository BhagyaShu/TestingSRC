package conditionaloperators;

public class ifelseifvariable2 {
	
public static void main(String[] args) {
		
		String Projectdomain ="Telecom";
		
		if (Projectdomain == "HealthCare") {
			System.out.println("Medical related work");
		}
		else if(Projectdomain == "Banking") {
			System.out.println("work related to bank transaction");
		}
		else if (Projectdomain == "Telecom") {
			System.out.println("Work related to telecommunication");
		}
		else if (Projectdomain == "Booking portal") {
			System.out.println("Work related to booking tickets");
		}
		else {
			System.out.println("random project domain");
		}
		
	}

}

