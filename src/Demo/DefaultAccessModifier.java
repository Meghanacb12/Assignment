package Demo;

public class DefaultAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj = new BaseClass(); 
		   
        obj.display(); 
	}

}
class BaseClass 
{ 
    void display()      //no access modifier indicates default modifier
       { 
           System.out.println("BaseClass"); 
       } 
} 