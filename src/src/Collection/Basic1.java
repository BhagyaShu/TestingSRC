package Collection;

import java.util.ArrayList;

public class Basic1 {
	
	public static void main(String[] args) {
		//Homogeneous
		ArrayList <Integer> list = new ArrayList();
		
		list.add(123);
		list.add(25644);
		list.add(89963);
		
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*****************////////////*******************");
		list.remove(1);
		int size = list.size();
		System.out.println(size);
		
		for (int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
