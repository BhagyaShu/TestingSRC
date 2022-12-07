package conditionaloperators;

public class ifelseif2 {
	
public static void main(String[] args) {
		
		int marks = 75;
		
		if (marks>78) {
			System.out.println("Student pass in distinction");
		}
		else if(marks > 80) {
			System.out.println("Student pass in first class");
		}
		else if (marks >=50) {
			System.out.println("Student pass in second class");
		}
		else if (marks >=35) {
			System.out.println("Student is pass");
		}	
		else {
			System.out.println("Student is fail");
		}
	}
	

}


