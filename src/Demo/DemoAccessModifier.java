package Demo;

public class DemoAccessModifier {
	void display() {
		System.out.println("Hello");
	}
}
class Child 
{ 
public static void main(String args[]) 
    { 
		DemoAccessModifier obj = new DemoAccessModifier(); 
        obj.display(); 
    } 
} 