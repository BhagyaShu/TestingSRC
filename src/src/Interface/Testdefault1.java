package Interface;

public class Testdefault1 implements Default{ // new implementation class
	
	public void Mart() { // completed from interface
		System.out.println("All shops closed"); 
	}
	
	public static void main(String[] args) {
		
		Testdefault x = new Testdefault();  // object of implementation class 
		Testdefault1 y = new Testdefault1(); // object of implementation class
		
		x.Mart(); // complete method from interface to class Testdefault
		x.Dmart(); // default method of interface call with impl. class object
		
		y.Mart(); // complete method from interface to class Testdefault
		y.Dmart(); // default method from interface
		
	}

}
