package String;

public class split1 {
	
public static void main(String[] args) {
		
		String s = "26/09/2022";
		
		String [] Result = s.split("/");
		
		for(int i = 0;i<Result.length;i++)  {
			
			System.out.println(Result[i]);
		}
		
	}

}



