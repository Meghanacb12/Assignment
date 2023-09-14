package Demo;

public class PublicAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj = new Parent(); 
         obj.display();
	}

}
class Parent{
	public void display() {
		System.out.println("Public access modifier");
	}
}