package HomeWork;

import java.util.Scanner;

public class arrayHW {
	

		
		static int countFreq(int arr[], int size, int num)
		{
			
			int index = 0, l =0, r =arr.length -1,mid;
			
			while(l<=r) {
				mid = l +((r-l)/2);
				
				
				if(num == arr[mid] && (arr[mid -1]<arr[mid] || mid == 0)) {
					index = mid;
					break;
				}
				
				else if(arr[mid]>=num ) {
					r = mid -1;
					
				}
				else {
					l = mid +1;
				}
			}
			
			return index;
		}	
		
		

	
	public static void main(String[] args )  {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		int num = s.nextInt();
		int freq = countFreq(arr, size, num);
		if(freq != 0) {
			System.out.print(freq);}
		else {
			System.out.print("NA");}
	}

}
