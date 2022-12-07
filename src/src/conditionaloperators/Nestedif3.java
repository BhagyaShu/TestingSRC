package conditionaloperators;

public class Nestedif3 {
	
	public static void main(String[] args) {
		String AB = "CD";
		String XYZ = "ABC";
		
	if (AB == "YZ")	{
		System.out.println("Username is Correct");
		
		if(XYZ == "ABC") {
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

