package Array;

public class Basic {
	
	public static void main(String[] args) {
		
		String ar [] = new String [6] ; // Array declaration with size
		
		ar [0] = "Java" ; // Array initialization
		ar [1] = "Silenium" ;
		ar [2] = "SQL" ;
		ar [3] = "APM" ;
		ar [4] = "Pyton" ;
		ar [5] = "Jira" ;
		//ar [6] = "Manual" ;
		//ar [7] = "Automation" ;
		
		//System.out.println(ar[2]);
		
		System.out.println("--------------Print all information in Array-------------");
		
		
		for(int i=0;i<=5;i++) {  // calling all info from array
			System.out.println(ar[i]);
		}
		
		
		
		
	}

}
