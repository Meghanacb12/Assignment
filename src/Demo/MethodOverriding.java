package Demo;

public class MethodOverriding extends B {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	 A a1 = new A();
	     B b1 = new B();
	    a1.name();
	    b1.name();
	    */
		MethodOverriding n1=new MethodOverriding();
		n1.name();
	}

}

class A{
	void name(){
	System.out.println("Megha");
	}
}

class B extends A {
	void name() {
		System.out.println("Meghana CB");
	}
}