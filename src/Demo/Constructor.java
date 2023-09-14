package Demo;

public class Constructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj= new Constructor();
		Constructor obj1= new Constructor("name");
	}

	Constructor(){
		System.out.println("Default constructor");
	}
	
	Constructor(String m){
		System.out.println("Parameterized constructor " +m);
	}
}
