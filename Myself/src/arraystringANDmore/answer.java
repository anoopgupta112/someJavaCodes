package arraystringANDmore;

public class answer {
	public static void main(String[] args) {

//	int arr[] = {1,2,3,4,5};
//	int n = 0;
//	
//	
//	for(int i =0; i<arr.length;i++) {
//		n = n+arr[i];
//		
//		
//	}
//	System.out.println(n);
//	
//	
		
//		System.out.print(isAramstrongNumber(153));
//		System.out.print(power(2,6));
		
		System.out.print(AutomorphicNumber(6));


		
	}
//	public static boolean isAramstrongNumber(int n) {
//		int noOfDigits = String.valueOf(n).length();
//		int num = n, sum =0;
//		while(num != 0) {
//			sum = sum+(int) Math.pow(num % 10,  noOfDigits);
//			num=num/10;
//		}
//		return sum == n;
//	}
	
	
	
//	public static int power(int num, int power) {
//		int res = 1;
//		for(int i = 1; i<=power;i++) {
//			res *=num;
//		}
//		return res;
//	}
	
	
	public static boolean AutomorphicNumber(int n) {
		
		long square =(long) Math.pow(n, 2);
		
		
		return String.valueOf(square).endsWith(String.valueOf(n));
	}
}
