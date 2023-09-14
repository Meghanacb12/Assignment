package Demo;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello"; 	// creating string by literal 
		System.out.println(a);
		
		String b =new String("Java");  	//creating string by new keyword
		System.out.println(b);
		System.out.println(b.length());
		System.out.println(b.equals(a));
		
		String c="This is String";
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		
		
		System.out.println(c.startsWith("This"));
		System.out.println(c.endsWith("java"));
		System.out.println(c.indexOf("s"));
		System.out.println(c.lastIndexOf("s"));
		System.out.println(c.charAt(5));
		System.out.println(c.replace("String", "Java"));
		System.out.println(c.contains("is"));
		System.out.println(c.substring(5));
		System.out.println(c.substring(3, 7));
		
		String d=" ";
		System.out.println(d.isEmpty());
		
		
	}

}

