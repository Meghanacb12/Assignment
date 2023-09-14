package JavaDemo;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	E1();
		//E2();
		E3();
	}
	
	private static void E1() {
		int a=10;
		int b=0;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b); 	//airthmetic exception
	}
	
	private static void E2() {
		String s= null;
		System.out.println(s.length()); //string indexout of bound
	}
	
	public static void E3() {
		int arr[]= new int [3];
		arr[0]=1;
		arr[1]=3;
		arr[2]=56;
		System.out.println(arr[4]);		//array indexout of bound exception
	}
}
