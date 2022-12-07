package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Basic3 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap <Integer,String>();
		
		map.put(31, "Testing");
		map.put(85, "Manual");
		map.put(35, null);
		map.put(null, null);
		map.put(null, "Java");
		map.put(null, null);
		
		for(Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue() );
		}
		
		map.put(66, "C++");
		
		System.out.println("***************/////////////////////***************");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue() );
			
		}
	}
}