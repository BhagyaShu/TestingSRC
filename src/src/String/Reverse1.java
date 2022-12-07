package String;

public class Reverse1 {
	
	public static void main(String[] args) {
	
	
	String a = "My Name is Shubham";
	String rev ="";
	
	for(int i =a.length()-1;i>=0;i--) {
		   rev = rev + a.charAt(i);

	
	}
	
	System.out.println(rev);
	System.out.println(rev.lastIndexOf("e"));
	
	
	}
	
	
	
	

}
