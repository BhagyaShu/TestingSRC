package Interface;

public class Staticmethod implements Methodstat {
	
	public void Display() { //method from interface is completed
		System.out.println("Non static method running");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Staticmethod x = new Staticmethod(); //implementation class object
		
		x.Display();
		Methodstat.Show(); // static method of interface call with interface name only
	}
	
	

}
