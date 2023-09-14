package Demo;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m1= new MethodOverloading();
		m1.sum();
		m1.sum(12,9);
	}
	void sum(){
		int a=5,b=3;
		int sum=a+b;
		System.out.println("Sum is: " +sum);
	}
	int sum(int a, int b) {
		int sum=a+b;
		System.out.println("Sum is: " +sum);
		return sum;
		
	}
}
