package conditionaloperators;

public class Nestedif2 {
	
	public static void main(String[] args) {
		String SB = "BG";
		String XYZ = "ABC";
		
	if (SB == "BG")	{
		System.out.println("Username is Correct");
		
		if(XYZ == "ABV") {
			System.out.println("Password is correct");
			System.out.println("Login is Succesful");
			
		}
		else {
			System.out.println("Wrong Password");
			System.out.println("login is failed");
		}
		
	}
	else {
		System.out.println("Wrong Username");
		System.out.println("Login failed");
		
	}
		
	}

}


