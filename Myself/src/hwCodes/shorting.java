package hwCodes;

public class shorting {
public static void main(String[] args) {
	
      int[] arr = {7, 4, 0, 1};
      Bubblesort(arr);
      
//      selectionSortAfterNIterations(arr, 2);
//	  desendingOrdersort(arr, 4);
//      selectionSort(arr,2);
	 
	}

//question 3 bubble sort
static void Bubblesort(int[] arr) {
	
	int[] temp3 = new int[arr.length];
	int n = arr.length;
	for(int i=0;i<n;i++) {
		temp3[i]= arr[i];
	}
	for(int i = 0;i<n;i++) {
		
		
		for(int j = 0;j<(n-1)-i;j++) {
			
			if(arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1] = temp;
				
			}
		}
		 
	}

	
	for(int i = n-1;i>=0;i--) {

		for(int j = 0;j<n;j++) {
			if(arr[i] == temp3[j]) {
				System.out.println(j+" ");
			}
			

		
	}}
	
}

/*
public static void selectionSort(int[] arr,int n){  
	
    for (int i = 0; i < arr.length - 1; i++)  
    {
    	if(n>0) {
		
        int index = i;  
        for (int j = i + 1; j < arr.length; j++){  
            if (arr[j] < arr[index]){  
                index = j; 
            }  
        }  
        int smallerNumber = arr[index];   
        arr[index] = arr[i];  
        arr[i] = smallerNumber;  
       
    }
    	n--;
    }
    for(int i: arr) 
    	System.out.print(i+" ");
    
}  
*/




/*
public static void selectionSortAfterNIterations(int[] arr , int n) {
    int size = arr.length-1, temp;
	for(int i = 0;i<size;i++) {
	
		for(int j = i+1;j<size;j++) {
			
			if(arr[j]<arr[i]) {
			
			 temp = arr[i+1];
			arr[i+1]= arr[j];
			arr[j]= temp;
			i++;
			j++;
			}
			else {
				i++;
				j++;
			}
		}
	
	}
	for(int ar: arr) 
		System.out.print(ar+" ");
  
  }
  */
	/*
	
public static void desendingOrdersort(int[] arr, int size) {
	
     for (int i = 1; i < size; ++i) {
         int temp = arr[i];
         int j = i - 1;

       
         while (j >= 0 && arr[j] >temp) {
             arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = temp;
     }
     for (int i = size-1; i >= 0; i--)
         System.out.println(arr[i]);
}
*/

}




	

/*  sort -------------------------------
public static int[] sort(int[] arr) {
	int n=arr.length;
	int min=Integer.MAX_VALUE;
	int index=0;
	
	if(n==1)
		return arr;
	
	for(int i=0;i<n;i++) {
		min=Integer.MAX_VALUE;
		for (int j=i;j<n;j++) {
			
			if(arr[j]<min) {
				min=arr[j];
				index=j;
			}
		}
		
		if(arr[i]>arr[index])
		{
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
	}
	return arr;
}
*/







