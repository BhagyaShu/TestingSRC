package String;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String a = "VELOCITY";
		String b = "velocity"; // 01234567
		String c = "Shubham";
		String d = "City";
		
		System.out.println(a.replace("C", "G")); // it replace some char from string
		System.out.println(b.isEmpty()); // true or false
		System.out.println(c.concat(b)); // String concat means that adding 
		System.out.println(c.substring(4));
		System.out.println(c.substring(0, 5));
		System.out.println(a.endsWith("o"));  //true or false
		System.out.println(c.startsWith("S"));  //true or false
		
		System.out.println(c.lastIndexOf("h"));
		System.out.println(c.indexOf("h"));
		
		System.out.println(b.charAt(3));
		System.out.println(a.contains("ocit"));
		System.out.println(a.equals("b"));
		System.out.println(b.equalsIgnoreCase(a));
		System.out.println(a.length());
		System.out.println(c.length());
		System.out.println(a.toLowerCase());
		System.out.println(c.toUpperCase());
		System.out.println(a==b);
		
		String s = String.join(b,a,c);
		System.out.println(s);
		
		System.out.println(c.trim());
		
		
		
	}

}
