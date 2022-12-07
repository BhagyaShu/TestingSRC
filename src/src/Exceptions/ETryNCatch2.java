package Exceptions;

public class ETryNCatch2 {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b= 4;
		int c = 0;
		 
		int d [] = {23,45,65,89};
		
		System.out.println("Start");
		
		try {
			
			c = a/b;  // risky code
			//System.out.println(c);
			System.out.println(d[2]);
		}
		
		catch(ArrayIndexOutOfBoundsException s) {
			
			//System.out.println("Alternative code");
			System.out.println(d[3]);
		}
		
		System.out.println(c) ;
		System.out.println("Normal flow");
		 
		//Exception generated and not get handled
		// try =>
		
		// Exception generated and get handled
		// try => catch => normal flow
		
		//exception not generated
		// try => normal flow
		
		
	}

}
