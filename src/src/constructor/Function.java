package constructor;
public class Function {
	
	String name;
	
	Function (int s){
		System.out.println(s);
}
	Function (int s,double p){
		System.out.println(s);
		System.out.println(p);
}
	Function (int s,float q){
		System.out.println(s);
		System.out.println(q);
		
	}
	
	Function (int d,char a){
		System.out.println(d);
		System.out.println("$");
		
		
	}
	
	Function(String p) {
		name =p;
		System.out.println(name);
		
		
	}
	public static void main(String[] args) {
		Function a = new Function(5);
		
		Function b = new Function(6,10.21);
		
		Function c = new Function(7,50.2f);
		
		Function d = new Function(8,'$');
		
		Function e = new Function("rakesh");
		
		
		
		
		
		
		
			
		
			
		}
		
	}
	
		
	
	

	 
	


