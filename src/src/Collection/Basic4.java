package Collection;

import java.util.Hashtable;
import java.util.Map;

public class Basic4 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		
		table.put(34, "Testing");
		table.put(35, "Manual");
		table.put(76, "Automation");
		table.put(90, "Selenium");
		table.put(43, "Java");
		table.put(21, "API");
		table.put(45, "efrdgf");
		
		for(Map.Entry<Integer, String> m : table.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue() );
		}	
			table.put(43, "C++");
			
			System.out.println("***************/////////////////////***************");
			
			for(Map.Entry<Integer, String> m : table.entrySet()) {
				System.out.println(m.getKey()+ " " + m.getValue() );
			
		
		}
	
	}
	}
