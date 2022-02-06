package hwCodes;


class homeWork{
	public static void alternativeSorting(int[] arr){
		int min_index;
		for(int i = 0;i<arr.length-1;i++) {
			min_index = i;
			for(int j = i+1;j<arr.length-1;j++) {
				if(arr[j]>arr[min_index]) {
					min_index = j;
				}
			}
			if(arr[i]<arr[min_index]) {
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i]= temp;
			}
			
		}
		
		
		for(int i= 1;i<arr.length;) {
			arr[i] = arr[arr.length-1-i];
//			System.out.print(arr[i]);
			i+=2;
		}
		for(int r: arr) {
			System.out.println(arr[r]);
		}
	}
}

public class AdvanceSorting {
	public static void main(String[] args) {
int[] arr = {2,3,4,6,2,4,7,0};
int arr2[] = {2,1,4,3};
homeWork.alternativeSorting(arr);
//System.out.println(merge(arr2, 0, (arr2.length-1/2), arr2.length-1));
}
	
	
	static int[] merge(int[] numb, int start, int mid, int end) {
	    int left = start; //inital index of first subarray
	  
	    int right = mid + 1; // initial index of second subarray
	    int k = 0; // initial index of merged array
	    int[] temp = new int[numb.length];
	    while (left <= mid && right <= end) {
	        if (numb[left] >= numb[right]) {
	            temp[k] = numb[left];
	            k++;
	            left++;
	        } else {
	            temp[k] = numb[right];
	            k++;
	            right++;
	        }
	    }
	    // Copy the remaining elements on left half , if there are any
	    while (left <= mid) {
	        temp[k] = numb[left];
	        k++;
	        left++;
	    }
	    // Copy the remaining elements on right half , if there are any
	    while (right <= end) {
	        temp[k] = numb[right];
	        k++;
	        right++;
	    }
	    // Copy the remaining elements from array t back the numbers array
	    left = start;
	    k = 0;
	    while (left <= end) {
	        numb[left] = temp[k];
	        left++;
	        k++;
	    }
	    return numb;
	}
}
