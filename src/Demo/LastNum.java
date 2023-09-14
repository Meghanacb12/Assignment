package Demo;

import java.util.Scanner;

public class LastNum {
	 public static void main (String[] args)
	    {
	       /*  Scanner sc = new Scanner(System.in);
	         System.out.println("Enter the number: ");
	         int num = sc.nextInt();
	         
	         int lastDigit = num%10; 
	         
	         System.out.println("The last Digit of the Number is "+lastDigit);
	         */
		 LastNum l=new LastNum();
		 int res=l.lastDigit(3547);
		 System.out.println(res);
		 	
	    }
	 public int lastDigit(int num) {
		 int rem=num%10;
		 return rem;
	 }
}
