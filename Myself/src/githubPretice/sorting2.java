package githubPretice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sorting2 {
public static void main(String[] args) {
	
	int arr[] = {9, 1, 5, 29, 4};
//	mergeSorts.mergeSortValu(arr, 0, arr.length-1);
//	for(int i: arr) {
//		System.out.print(i+" ");
//	}
	int arr1[]= {2,3,8};
//	
	int arr2[] = {1,2,4,9};
	Scanner scanner = new Scanner(System.in);
	int sizeArray1 = scanner.nextInt();

	int sortedArray1[] = mergerOfArray.getArrayInput(sizeArray1, scanner);
	int sizeArray2 = scanner.nextInt();
	int sortedArray2[] = mergerOfArray.getArrayInput(sizeArray2, scanner);
	
	
	
	int arr3[] = mergerOfArray.mergeBothInAscendingOrder(sortedArray1,sortedArray2);
	for(int i: arr3) {
		System.out.println(i+ " ");
	}
	
}


}

//question 4 of advance array
class mergerOfArray{
	public static int[] getArrayInput(int sizeArray1, Scanner scanner) {
		int arr[] = new int[sizeArray1];
		for(int i = 0;i<=sizeArray1-1; i++) {
		
			arr[i] = scanner.nextInt();
		}

		
		return arr;
	}
	
	 public static int[] mergeBothInAscendingOrder(int arr1[], int arr2[]) {
		  
	
	
		int[] m = new int[(arr1.length+arr2.length)];
		 int i = 0, j = 0,k =0;
		 while(arr1.length > i && arr2.length > j) {
		
			 if(arr1[i] <= arr2[j]) {
				
			
				 m[k] = arr1[i];
				 k++;
				 i++;
			 }
			 else {
			
		
				m[k] = arr2[j];
				 k++;
				 j++;
			 }
		 }
		 while(arr1.length>i) {
		m[k]= arr1[i];
			 k++;
			 i++;
		 }
		 while(arr2.length>j) {
			
			m[k]= arr2[j];
			 k++;
			 j++;
		 }
		
		 
		  return m;
		  }
}




//question3(merge sort) of advance sort
class mergeSorts{
	public static void mergeSortValu(int[] arr, int l,int r) {
		int m = l+ (r-l)/2;
		if(l<r) {
			mergeSortValu(arr, l, m);
			mergeSortValu(arr, m+1, r);
			merge(arr, l,m, r);
		}
		   
	}
	
	public static void merge(int[] arr , int start ,int m, int end) {
		
	  
		int n1 = m-start+1, n2 = end-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(int i = 0;i<n1;i++) {
			L[i] = arr[start+i];
		}
		for(int i = 0;i<n2;i++) {
			R[i] = arr[m+1+i];
		}
		int i = 0,j=0,k=start;
		while(i<L.length && j<R.length) {
			if(L[i]>= R[j]) {
				arr[k] = L[i];
				k++;
				i++;
			}
			else {
				arr[k] = R[j];
				k++;
				j++;
			}
		}
		while(j<R.length) {
			arr[k] = R[j];
			k++;
			j++;
		}
		while(i<L.length) {
			arr[k] = L[i];
			i++;
			k++;
		}
	
		
		}
}
