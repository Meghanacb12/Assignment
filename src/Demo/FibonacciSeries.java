package Demo;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		Fibonacci(n);
	}

	 static void Fibonacci(int n) {
		 int num1 = 0, num2 = 1;
		 
	        int count = 0;
	 
	        while (count < n) {//0<10  1<10
	 
	            // Print the number
	            System.out.print(num1 + " "); 
	 
	            int num3 = num2 + num1;	//num3=1+0 =1   1+1=2
	            num1 = num2;	//1
	            num2 = num3;	//1
	            count++;	//1
	        }
		
	}

}
