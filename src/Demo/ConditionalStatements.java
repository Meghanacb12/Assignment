package Demo;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
				Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
				System.out.print("Enter Maths marks- ");  
				int maths= sc.nextInt();  
				System.out.print("Enter Science marks- ");  
				int science= sc.nextInt();  
				System.out.print("Enter English marks- ");  
				int english= sc.nextInt();  
			
			if(maths>=60 && science>=50 && english>=40) {
				System.out.println("Pass");	
			}
			else
					System.out.println("Fail");		
	}

}
/*if((maths>=60 && maths<=100)&&(science>=50 && science<=100)&&(english>=40&&english<=100)) 
{
System.out.println("Pass");	
}
else
	System.out.println("Fail");		
*/