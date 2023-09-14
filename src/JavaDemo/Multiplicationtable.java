package JavaDemo;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the n value");
		 n=sc.nextInt();
		 
		 for(i=1;i<=10;i++) {
			 int mult=n*i;
			 System.out.println(n+"*"+i+ "=" +mult);
		 }
	}

}
