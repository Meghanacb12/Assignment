package Demo;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2538,reverse=0;
		while(num!=0) {
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number is: " +reverse);
	}

}
