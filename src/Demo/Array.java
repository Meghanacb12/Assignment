package Demo;

public class Array {
	static int arr[] = { 1,2,3,4,5 };
	 
    // method for sum
    static int sum()
    {
        int sum = 0; // initialize sum
        int i;
 
        for (i = 0; i < arr.length; i++) // 0 <5 1<5
            sum += arr[i];  // 1 3
 
        return sum;
    }
 
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is " + sum());
    }
}
