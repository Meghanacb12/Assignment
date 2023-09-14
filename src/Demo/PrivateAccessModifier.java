package Demo;

public class PrivateAccessModifier {
	 public static void main(String args[]){  
		   TestClass obj=new TestClass();  
		   System.out.println(obj.num);//try to access private data member - Compile Time Error  
		   obj.printMessage();//Accessing private method - Compile Time Error  
		   }  
}

class TestClass{  
    //private variable and method
	//Private num=100;
     int num=100;  
    void printMessage()
    {
    	System.out.println("Hello java");
    }  
     
} 