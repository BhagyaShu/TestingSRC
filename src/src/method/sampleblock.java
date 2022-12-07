package method;

public class sampleblock {
	
	static {
		
		System.out.println("static block running");
		
	}
	
	{
		System.out.println("non static block is running");
	}

	public static void main(String[] args) {
		
		sampleblock a = new sampleblock();
		
		System.out.println("Main method started");
		
		sampleblock b = new sampleblock();
		
	}
	
}	
	
		    
