package Exceptions;

public class ETryNCatch5 {
	
	public static void main(String[] args) {
		
		int a= 19;
		int b = 0;
		int c = 0;
		
		int d [] = {23,45,67,95};
		
		System.out.println("Start");
		
		try {
			
			System.out.println(d[5]);
			c = a/b;
			
		
		}
		catch(ArithmeticException s) {
			
			System.out.println("catch Arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch array index out of bound exception");
			
			try {              //////////////// New Try-Catch inside catch
				c = a/b;
			}
			catch(ArithmeticException s) {
				System.out.println("Arithmetic exception");
			}
		}
		 System.out.println(c);
		  System.out.println("Normal flow");
		
		
		}
		
		}
	


