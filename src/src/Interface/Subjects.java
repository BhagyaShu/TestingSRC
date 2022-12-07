package Interface;

public class Subjects implements L {
	
	public void thermo() {
		System.out.println("thermo method");
		
	}
	
	public void fluid() {
		System.out.println("fluid method");
	}
	
	public void physics() {
		System.out.println("physics method");
	}
	
	public void chemistry() {
		System.out.println("chemistry method");
	}
	
	public static void main(String[] args) {
		
		Subjects x = new Subjects();
		x.thermo();
		x.fluid();
		x.physics();
		x.physics();
	}
	

}
