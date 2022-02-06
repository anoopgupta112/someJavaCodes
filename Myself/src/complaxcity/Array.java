package complaxcity;

public class Array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr1 = {11,12,13,14,15,16,17,18};
		
		System.out.print(findSecondnum(arr));
		System.out.print(" ");

		makefinalArray(arr1);
		hello(arr,arr1);
		System.out.println();
		
		System.out.println(" ans is " +findingSecondmax(arr));

	}
	
	public static int findSecondnum(int[] arr) {
		int cont = 0;
		for(int i =0;i<arr.length;i++) {
			
			System.out.print(" ");
			System.out.print(arr[i]);
			cont = arr[i];
		}
		return cont;
		
		

		
	}
	
	
public static int makefinalArray(int[] arr1) {
	int fila = 0;
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]);
		System.out.print(" ");
		fila = arr1[i];
	}
	
	
	
		
		return fila;
		
	}
static void hello(int[] arr,int[] arr1) {
	System.out.println("working fine");
	
	for(int i =0;i<arr.length;i++) {
		
		System.out.print(" ");
		System.out.print(arr[i]);
		}
	

	for(int i =0;i<arr1.length;i++) {
		
		System.out.print(" ");
		System.out.print(arr1[i]);

		}
	
	
	
	
	
}


public static int findingSecondmax(int[] arr) {
	
	int secondMax =Integer.MIN_VALUE;
	int max = Integer.MIN_VALUE;
	
	for(int i = 0; i<arr.length;i++) {
		if(arr[i]>max) {
			 secondMax = max;
			 max = arr[i];
			
		}
		else if(arr[i]<max && arr[i]>secondMax) {
			secondMax = arr[i];
		}
	}

	return secondMax;
}

//int max = Integer.MIN_VALUE;
//int secondMax = Integer.MIN_VALUE;
//   System.out.println("Max number is : "+max);
//    System.out.println("Second Max number is : "+secondMax);
//
//for(int i = 1;i<arr.length;i++) {
//	if(max<arr[i]) {
//		secondMax = max;
//	max = arr[i];
//	
//	
//	}
//	else if(secondMax<arr[i] && arr[i]<max) {
//		secondMax = arr[i];
//	}
//	
//}
//return secondMax;

}
