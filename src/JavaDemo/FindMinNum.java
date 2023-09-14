package JavaDemo;

public class FindMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{2,6,8},{45,23,1},{35,6,9}};
		
		System.out.println("Minimum number of array is: " +getmin(arr));
	}
	 static int getmin(int[][] arr) {
		int i,j;
		int min=arr[0][0];
		for(i=0;i<=arr.length;i++) {
			for(j=0;j<=arr.length;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
		}
		return min;
		
	}

}
