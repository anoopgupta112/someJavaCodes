package complaxcity;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,4,4,7,9,10,12,13,15};
		int[] arr2 = {9,8,7,6,5,4,3,2,1,0};
		int number = 1;
		
		
		
		
//		int index = getIndexFromDescendingBinarySearch(arr2, number);
//		System.out.println(number +" "+ index);
		
		
		int index = getFirstIndexBinarySearchAscending(arr, number);
		System.out.println(index == -1 ? ( number + "not found in array."): 
			 ( number +" at left most index "+index));
		
		
		
		
		
		
//		int index = getIndexFromAscendingBinarySearch(arr, number);
//		System.out.println(index == -1 ? ("The number" + number + "is not present in array."): 
//			 ("Got the number "+ number +" at index position "+index));
		
		
	}
	
	/*
	public static int getIndexFromAscendingBinarySearch(int[] arr, int number ) {
		int l =0, r = arr.length -1, mid;
		int index = -1;
		while(l<=r) {
			System.out.println("l ="+l+"r ="+r);
			mid = (l+r)/2;
			if(arr[mid]> number) {
				r = mid-1;
			}
			else if(arr[mid]<number) {
				l = mid+1;
			}
			else {
				index = mid;
				break;
			}
		}
		
		
		
		
		return index;
	}
	
	*/
	
	
	
	
	
	public static int getFirstIndexBinarySearchAscending(int[] arr, int number ) {
		int l =0, r = arr.length -1, mid;
		int index = -1;
		while(l<=r) {
			mid = l+((r-l)/2);
			if(arr[mid] == number && (mid == 0 || arr[mid -1]<arr[mid])) {
				index = mid;
				break;
			}
			else if(arr[mid] >= number) {
				r = mid -1;
			}
			else {
				l = mid +1;
			}
			
			
			
			
			
			
			
			
			
			
//			if(arr[mid]> number) {
//				r = mid-1;
//			}
//			else if(arr[mid]<number) {
//				l = mid+1;
//			}
//			else {
//				
//				for(int i = mid;i>0;i-- ) {
//					if(number == arr[mid] && number > index +1) {
//						index = mid;
////						System.out.println(arr[mid]+" "+number+" "+index);
//					}
//					
//				}
//				
//				break;
//			}
		}
		
		
		
		
		return index;
	}
	
	
	
//	  public static int getIndexFromDescendingBinarySearch(int[] arr2, int number){
//	      int index = -1;
//	      int l= 0,r = arr2.length -1,mid;
//	      
//	      
//	      while(r>=l) {
//	    	  mid = (l+r)/2;
//	    	  if(number>arr2[mid]) {
//	    		  r =mid +1;
//	    		
//
//	    	  }
//	    	  else if(number<arr2[mid]) {
//	    		  l = mid -1;
//	    
//
//	    	  }
//	    	  else {
//	    		  index = mid;
//	    	
//	    		  break;
//	    	  }
//	    	
//	      }
//		  
//		  
//		  return index;
//	    }

}
