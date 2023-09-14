package Demo;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Scanner scn=new Scanner(System.in);
		 System.out.println("Enter the num1 value");
		 int n11=scn.nextInt();
		 
		 System.out.println("Enter the num2 value");
		 int n21=scn.nextInt(); 
    
		 if (n11 == n21)
	       System.out.println ("both are equal");
	     else if (n11 > n21)
	         System.out.println (n11 + " is greater");

	     else
	         System.out.println (n21 + " is greater");
	 	   
	 	 /*	
		int n31=(n11>n21)?n11:n21;
		System.out.println("largest is:" +n11);
		
		System.out.println("largest is: " +n21);
	*/
	}

}
