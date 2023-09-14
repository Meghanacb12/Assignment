package Demo;

public class ReverseString {

	public static void main(String[] args) {
		  
        String str= "Hello", reversestr="";
        char ch;
       
      System.out.println("String is: " +str);
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        reversestr= ch+reversestr; //adds each character in front of the existing string
      }
      System.out.println("Reversed string is: "+ reversestr);
    }

}
