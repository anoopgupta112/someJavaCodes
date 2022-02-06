package hwCodes;

import java.util.Arrays;

public class printallnum {
	public static void main(String[] args) {
int arr1[] = {1,2,3,4,5};
int arr2[] = {2,4,6,7,8};
printnum(arr1, arr2);

	}
	
	public static void printnum(int[] arr1, int[] arr2) {
		
		int len = arr1.length + arr2.length;
	int count = 0;
	int count2 = 0;
		if(arr1.length <= arr2.length) 
		{
			len = arr2.length;
		}
		else {
			len = arr1.length;
		}
		for(int i = 0;i<=len-1;i++) {
			boolean checker = true;
			for(int j = 0; j<len-1;j++) {
				
			if(checker) {
				if(arr1[i]==arr2[j]) {
					count = arr1[i];
					checker = false;
				}
				else {
					count = arr2[i];
					checker = true;
				}
				System.out.println(count);
			}
			}
		
		}
		
		}
	
	}

