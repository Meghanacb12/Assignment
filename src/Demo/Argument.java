package Demo;

public class Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj =new Demo();
		obj.sum();
		System.out.println("Addition of a and b is: " +obj.addition(4, 5));
		
	}

}

class Demo{
	public void sum() 	//no argument method
	{
		System.out.println("sum");
	}
	
	public int addition(int a,int b) 	//method with arguments
	{
		int c=a+b;
		return c;
		
	}
}