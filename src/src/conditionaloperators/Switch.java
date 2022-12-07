package conditionaloperators;

public class Switch {
	
	public static void main(String[] args) {
		
	int Number = 7;
	
	switch (Number) {
	
	case 1 :
		System.out.println("today is monday");
		break;
	case 2 :
		System.out.println("today is tuesday");
		break;
	case 3:
		System.out.println("today is wednesday");
		break;
	case 4:
		System.out.println("today is Thursday");
		break;
	case 5 :
		System.out.println("today is friday");
		break;
	case 6 :
		System.out.println("today is saturday");
		break;
	case 7 :
		System.out.println("today is sunday");
		break;
		
		default :
			System.out.println("Enter correct input from 1 to 7");
			
	}
	}

}
