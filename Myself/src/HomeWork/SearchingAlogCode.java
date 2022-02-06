package HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchingAlogCode {
public static void main(String[] args) {

	/*
	 * //question 1
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	System.out.println(getComparisons(arr2, 21));
	*/
	
	
	//question 2
	/*
	int[] arr = {1, 2, 3, 4 ,5, 6};
	int key = 9;
	System.out.println(getComparisons(arr, key));
	*/
	
	//question 3
	/*
	int[] arr = {9, 6, 5,4,2,1,0};
	rotateArray(arr,7,4);
	*/
	
//	question 4
	int[] arr1 = {0, 1, 2, 3, 4, 5, 6};
	int[] arr2 = {3, 10, 15, 20, 23};
	System.out.print(median(arr1, arr2));
}
//question 4
public static int median(int[] arr1, int[] arr2) {
	
	
	List<Integer> mergeArr = new ArrayList<Integer>();
	for(int i = 0;i<arr1.length;i++) {
		mergeArr.add(arr1[i]);
		
	}
	for(int i = 0;i<arr2.length-1;i++) {
		mergeArr.add(arr2[i]);
		
	}
   Collections.sort(mergeArr);
    int count=mergeArr.size();
	int mid = mergeArr.get(count/2);
	int mid2 = mergeArr.get((count+1)/2);
	int result = (mid + mid2)/2;
	
	
	return result;
   
  }






//question 3
/*
static void rotateArray(int[] arr, int n, int d) {
	List<Integer> rotateElements = new ArrayList<Integer>();
	if(n>= d) {
   for(int i = 0;i<n ;i++) {
	   if(i<d) {
	  rotateElements.add(arr[i]);
	
	  }
	   else {
		   System.out.print(arr[i]+ " ");
	   }
	   

   }}
	else {
	int condition2 =d%n;
	  for(int i = 0;i<n ;i++) {
		   if(i < condition2) {
		  rotateElements.add(arr[i]);
		
		  }
		   else {
			   System.out.print(arr[i]+" ");
		   }
		   

	   }
}

   for(int i: rotateElements) {
	   System.out.print(i+ " ");
   }
   
}
*/


//question 2
/*
public static int getComparisons(int[] inputArr, int key) {
  int l = 0, r = inputArr.length-1, mid = 0,index = 0;
 

 while(l<=r) {
	 mid = l+ (r-l)/2;
	  if(key>inputArr[mid]) {
		
		  l = mid+1;
		  index++;
	  }
	  else if(key<inputArr[mid]) {
		
		  r = mid-1;
		  index++;
		 
	  }
	  else {
		 
		  break;
	  }
  
  }
	return index;
}
*/



/*
 * //question 1 code
public static int getComparisons(int[] inputArr, int key) {
	
	int count = 0;
	for(int i =0;i<inputArr.length;i++) {
		
		if(key<inputArr[i] || key>inputArr[i]) {
			count++;
		}
		else {
			break;
		}
		
	}
    return count;
}
	
	*/
	
	
	
}
