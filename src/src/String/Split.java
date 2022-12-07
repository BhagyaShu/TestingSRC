package String;

public class Split {
	
	public static void main(String[] args) {
		
		String s = "Velocity is the best training center";
		
		String [] Result = s.split(" ");
		
		for(int i = 0;i<Result.length;i++)  {
			
			System.out.println(Result[i]);
		}
		
	}

}
