package method;

public class StaticNonStatic {
	
   static int a = 20;
   int b = 30;
   
   public static void main(String[] args) {
	   System.out.println("Static variable="+a);
	   
	   StaticNonStatic x = new StaticNonStatic();  //object creation
	   
	   System.out.println("Non-static variable call with ref of x="+x.b);
	   
	   StaticNonStatic y = new StaticNonStatic(); //object creation
	   System.out.println("Non-static variable call with ref of y="+y.b);
	   
	   x.b=45;
	   System.out.println("Non-static variable call with ref of x updated="+x.b);
	   System.out.println("Non-static variable call with ref of y updated="+y.b);
	   
	   System.out.println("static variable call with ref of x="+x.a);
	   System.out.println("static variable call with ref of y="+y.a);
	   
	   x.a=70;
	   System.out.println("static variable call with ref x updated ="+x.a); //80
	   System.out.println("static variable call with ref y updated ="+y.a); //80
	   
	   
   }
}
