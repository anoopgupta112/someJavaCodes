package complaxcity;

import java.util.Scanner;

public class arrayhw {
	static int maxProduct(int[] arr) {
		int n = arr.length;
		if(n<2) {
			System.out.println("NA");
			return Integer.MIN_VALUE;
		}
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		
		for(int i =0;i<n;i++) {
			if(arr[i]>max) {
				secondmax = max;
			
				max = arr[i];
				

				int [][][] arr2 = new int[5][4][3];	
				
			}
			else if(arr[i]<max && arr[i]>secondmax) {
				secondmax = arr[i];
			}
		}
		
		return max*secondmax;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i] = s.nextInt();
		}
		int answer = maxProduct(arr);
		System.out.print(answer);
	}
}
