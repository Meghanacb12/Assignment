package Demo;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {78,46,265,87,43};
	/*	System.out.println("Original numeric array : "+Arrays.toString(arr));
	    Arrays.sort(arr);
	    System.out.println("Sorted numeric array : "+Arrays.toString(arr));
	    */
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
               // System.out.print(arr[i] + " "); 
            }
            for ( i = 0; i < arr.length; i++) { 
                System.out.print(arr[i] + "  "); 
              }  
	}

}
}
