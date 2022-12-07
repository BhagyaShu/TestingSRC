package Collection;

import java.util.HashSet;

public class Basic2 {
	
	public static void main(String[] args) {
		
		HashSet <Character> set = new HashSet <Character>();
		
		set.add('$');
		set.add('#');
		set.add('*');
		set.add('&');
		//Order Of insertion does not maintain
		
		//Advanced For Loop
		
		for(char t: set) { //syntax for advance for loop
			System.out.println(t);
		}
	
		
	}
	
	}