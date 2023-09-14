package Demo;

public class DemoConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Five f1 =new Five();
		f1.hyderabad();
		Five f2= new Five(20,23);
	}

}
class Five{
	Five()		//default constructor or no-argument constructor
	{
		System.out.println("This is default constructor");
	}
	Five(int a,int b) 		//Parameterized constructor
	{
		System.out.println("Addition of "+a+ " and "+b+" is: " +(a+b));
	}
	public void hyderabad() {
		System.out.println("Hyderabad");
	}
}

/*Properties of constructors:
 * constructor name should be same as class name.
 * it will be called by default when an object is created.
 * it will not have any return type.
 */
