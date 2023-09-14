package Demo;

public class Switch {


	public static void main(String[] args) {
		 char ch='E';   
		
		switch(ch){
		
		case 'E':
			System.out.println("subject is English "+ch);
			break;
		case 'M':
			System.out.println("subject is Maths "+ch);
			break;
		default:
			System.out.println("subject is science "+ch);
			break;
		}

	}
}