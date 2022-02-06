package hwCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayAllQus {
	
	
	
	
public static void main(String[] args) {
	/*
	Scanner s = new Scanner(System.in);

	int size = s.nextInt();
	int[] arr = new int[size];
	for(int i =0;i<size;i++) {
		arr[i] = s.nextInt();
		
	}
//	question 1
	int answer = firstNonRepeating(arr);
	if(answer != 0)
		System.out.print(answer);
	else 
		System.out.print("All elements are repeated");
	
//	question 2
	printDuplicates(arr);
	int[ ]
	*/
	

	
	
	 
	 
	 
	 
	 
	 
	 
//	 question 3
	int[] arr1 = {1,2,3,4,5,6};
	int[] arr2 = {2,3,4,5,6,7,8};
	mergeShortedArrays(arr1, arr2);
		
} 
//question 3
public static void mergeShortedArrays(int[] arr1, int[] arr2) {
int i = 0, j = 0, k = 0;
int arr[] = new int[arr1.length+arr2.length];
	
	
	while(i < arr1.length && j <arr2.length) {
		if(arr1[i] <= arr2[j]) {
			arr[k] = arr1[i];
		    k++;
		    i++;
		    }
		else {
			arr[k] = arr2[j];
			k++;
			j++;
			}
		
		
	}
	
	while(j< arr2.length) {
		arr[k] = arr2[j];
		k++;
		j++;
		
	}
	
	while(i< arr1.length) {
		arr[k] = arr1[i];
		k++;
		i++;
		}
	int a=0,c= Integer.MIN_VALUE;
	 
	while(a < arr.length) {
		if(c != arr[a]) {
			c =arr[a];
			System.out.println(arr[a]+" ");
		
			
		}
		a++;
	}

	
}

	


//question 1
static int firstNonRepeating(int arr[]) {
	int counter = 0;
	boolean checkPoint = false;

	
for(int i = 0;i<arr.length;i++) {
		for(int j = 0; j<arr.length;j++) {
			 if(arr[i]==arr[j] && j!=i) {
			checkPoint = true;
			}
		}
	
	if(!checkPoint) {
		counter = arr[i];
		break;
	}
	else {
		checkPoint = false;
	}
	}
	
	return counter;
}


//question2
static void printDuplicates(int arr[]) { 
	int count = 0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1 ; j < arr.length; j++) {
		

		if (arr[i] == arr[j] && count != arr[j]) {
			
			count = arr[i];
			

			
			System.out.println(count);
		
		}
		
	} }
  }
}
