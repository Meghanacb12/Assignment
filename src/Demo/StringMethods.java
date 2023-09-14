package Demo;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String s="megha";				//using literals
				char ch[]= {'M','E','G','H','A'};
				String s0=new String(ch);		//converting char array to string 
				String s1=new String("megha");//using object
				String s2="MEGHA";
				String s3="CB";
				String s4="meghana";
				
				
				System.out.println(s0);
				System.err.println("Equals");
				System.out.println(s.equalsIgnoreCase(s2));//string compare using equal ignore case
				System.out.println(s.equals(s1)); 		   //string compare using equal method
				System.out.println(s.equals(s3));
		System.out.println("--------------------------------------------------------------");
				System.err.println("==operator");
				System.out.println(s==s4);				   //using == operator
		System.out.println("--------------------------------------------------------------");
				System.err.println("compare");
				System.out.println("compare:"+s.compareTo(s4));	   //to compare string
				System.out.println("compare:"+s.compareTo(s3));
				System.out.println("compare: "+s3.compareTo(s4));
		System.out.println("-------------------------------------------------------------");
				System.err.println("Length and char");
				System.err.println("ChaAt");
				System.out.println("length: "+s.length());		//to get the length of the string
				System.out.println(s.charAt(1));		   //to get specific char in the string 
				System.out.println(s.codePointAt(1));

		System.out.println("------------------------------------------------------------");
				
				System.err.println("UPPER AND LOWER CASE");
				System.out.println("converted to uppercase: "+s.toUpperCase());		//convert to upper case
				System.out.println("converted to lowercase: "+s2.toLowerCase());		//convert to lower case
		System.out.println("--------------------------------------------------------------");
				System.err.println("start with and end with");
				String s5="Hello all how are you";
				System.out.println("starts with: "+s5.startsWith("G"));		//checking whether we have word starts with G
				System.out.println("ends with: "+s5.endsWith("A"));		//checks ends with A in s5
		System.out.println("--------------------------------------------------------------");
				System.err.println("indexof");
				System.out.println("Index of first:"+s5.indexOf("a"));//to get the index value of first string
				System.out.println("Index of last: "+s5.lastIndexOf("a"));//index value of last string with same letter
		System.out.println("--------------------------------------------------------------");
				System.err.println("Replace");
				System.out.println("Replace:"+s5.replace("all", "everyone"));//to replace the word r letter
		System.out.println("--------------------------------------------------------------");
				System.err.println("contains");
				System.out.println("Contains:"+s5.contains("you"));//to find the chr r word is there r not
		System.out.println("--------------------------------------------------------------");
				System.err.println("substring");
				System.out.println("Substring:"+s5.substring(3));//to print from where we want to start 
				System.out.println("Substring:"+s5.substring(3, 5));//to print from where to where
		System.out.println("--------------------------------------------------------------");
				System.err.println("Empty");
				System.out.println("Empty:"+s5.isEmpty());//To check string is empty or not
		System.out.println("----------------------------------------------------------");
				//to split the string		
				System.err.println("SPLIT");
				String[] result=s.split("k");
				for(String a:result) 
				System.out.println(a);	
		System.out.println("-------------------");
				String[] result1=s5.split(" ");
				for(int i = 0; i < result1.length; i++) {
					System.out.println(result1[i]);
				}
		System.out.println("------------------------------------------------------------------");
				System.err.println("Trim");
				
			String s6="  Java string ";
			System.out.println(s6);
			System.out.println(s6.trim());
		System.out.println("------------------------------------------------------------------");
			System.err.println("concat");
			String firstString = "Meghana";
			  String lastnameString= "CB";
			  System.out.println(firstString.concat(lastnameString));
			}


	}

