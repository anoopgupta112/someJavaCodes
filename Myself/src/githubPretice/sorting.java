package githubPretice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//insertion sort
class InsertionSort {
	static void sort2(int arr[]) {
		int n = arr.length;
		for(int i = 1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] >key) {
				arr[j+1]=arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
    /*Function to sort array using insertion sort*/
    void sort(int array[])
    {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

           
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        for(int i: array) {
        	System.out.print(i+" ");
        }
    }

}


public class sorting {
	

public static void main(String[] args) {
//	Bubblesort();
	int[] arr = {1, 2, 3, 4};
//   mergeSort(arr, 0, arr.length-1);
//   for(int i: arr) {
//	System.out.print(i+" ");
//}

//Selection(arr);

//	Selection(arr);
//	InsertionSort(arr);
//	MergeArray(arr1, arr2,  arrlist);
//	InsertionSort is = new InsertionSort();
//	is.sort(arr);
	
//	int i = bubbleSort.totalBubbleSortSwaps(arr, 2);
	InsertionSort.sort2(arr);
//	for(int i: t) {
//	System.out.print(i);
//	}
	
	
}
}


//question 4 bubble sort itration
class bubbleSort{
	  static int totalBubbleSortSwaps(int[] array, int m) {
		  int count = 0;
		  
		  for(int i = 0;i<m;i++) {
			 
			  for(int j = 0;j<(array.length-1)-i;j++) {
				 
				  if(array[j]<array[j+1]) {
					  count++;
					  int temp = array[j];
					  array[j] = array[j+1];
					  array[j+1] = temp;
				  }
			  }
		  }

		return count;
		  
		  
		 
		  }
}



// TODO: merge sort-------
/*
public static void mergeSort(int[] arr, int l, int r) {
	int m = l+ (r-l)/2;
	if(l<r) {
		mergeSort(arr,l,m);
		mergeSort(arr,m+1,r);
		merge(arr,l,m,r);
	}
}

public static void merge(int[] arr, int l, int m, int r) {
	int n1 = m-l+1, n2 = r-m;
//	create l & r array
	int[] L = new int[n1];
	int R[] = new int [n2];
	for(int i = 0;i<n1;i++) 
		L[i] = arr[l+i];
	for(int i = 0;i<n2;i++)
		R[i] = arr[m+1+i];
	int i = 0, j = 0, k = l;
	
	//while there's at least one element in each of the array to compare
	while(i < L.length && j <R.length) {
		if(L[i] <= R[j]) {
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
	   // left array is completely processed,
    // copying leftover elements from the right array
	while(j< R.length) {
		arr[k++] = R[j++];
		
	}
	  // right array is completely processed,
    // copying leftover elements from the left array
	while(i< L.length) {
		arr[k++] = L[i++];
		}
	
}
*/
//merge the array---------this is not any type of sort just code

/*
static void MergeArray(int[] arr1, int[] arr2,List<Integer> arrlist) {
	int n = arr1.length;

	for(int i = 0;i<n; i++) {
		arrlist.add(arr1[i]);
	
	}
	for(int j = 0; j<arr2.length;j++) {
		arrlist.add(arr2[j]);
	}
	for(int i=0;i<arrlist.size();i++){
	    
		Collections.sort(arrlist);
		System.out.println(arrlist.get(i));
	} 
}
*/

//Selection sort-------------
/*
static void Selection(int[] arr){
	int n = arr.length, min_index, temp;
	for(int i = 0;i<n;i++) {
		min_index = i;
		for(int j = i;j<n;j++) {
			if(arr[j]<arr[min_index]) {
			min_index = j;
			}
		}
		if(arr[i]>arr[min_index]) {
			temp = arr[i];
			arr[i]= arr[min_index];
			arr[min_index] = temp;
		}
	}
	for(int ar: arr) {
		System.out.println(ar);
	}
	
}
*/
//Bubble sort--------------------
/*
static void Bubblesort() {
	int[] arr = {5,2,9,3,2,9,-1};
	int n = arr.length;
	for(int i = 0;i<n;i++) {
		for(int j = 0;j<(n-1)-i;j++) {
			if(arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1] = temp;
				
			}
		}
	}
	for(int elements: arr) 
		System.out.println(elements);
	
}
}}
*/
