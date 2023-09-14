package Demo;

class First
{ 
   protected void display() 
    { 
        System.out.println("Protected"); 
    } 
} 
 
class Second extends First {}  
class Third extends Second {}

public class ProtectedAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second obj = new Second();     //create object of class B   
	    obj.display();       //access class A protected method using obj
	    
	    Third cObj = new Third();    //create object of class C
	    cObj.display ();     //access class A protected method using cObj
	}

}
