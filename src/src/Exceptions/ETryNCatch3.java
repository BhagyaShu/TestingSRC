package Exceptions;

public class ETryNCatch3 {
	
	 public static void main(String[] args) {
		 
		 int a = 20;
		 int b= 0;
		  int c = 0;
		  
		  int d [] ={23,45,67,85};
		  
		  
		  System.out.println("Start");
		  
		  try {
			  
			  c = a/b; //risky code
			  System.out.println(d[4]);
		  }
		  catch(ArrayIndexOutOfBoundsException s) {
			  
			  System.out.println("Alternative code");
			  System.out.println(d[3]);
			  
		  }
		  catch(ArithmeticException s) {              //// One try block & Multiple Catch 
			  
			  b= 2;
			  c = a/b;
		  }
		  System.out.println(c);
		  System.out.println("Normal flow");
		  
	 }

}
