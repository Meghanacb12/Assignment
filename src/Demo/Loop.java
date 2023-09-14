package Demo;

public class Loop {

	public static void main(String[] args) {
		int i,j=0,m=0;  // initializing variables
		
		for(i=0;i<=5;i++) 	//for loop condition
		{
			System.out.println("value of i is: " +i);
		}
		
		while(j<=3) 	//while loop condition
		{
			System.out.println("value of j is: " +j);
			j++;
		}
		
		do 			//do-while loop condition
		{
			System.out.println("value of m is:" +m);
			m++;
		}while(m<2);
	}

}
