package HomeWork;

import java.util.stream.IntStream;

public class perfectSqure {
	 public static void main(String[] args)
	    {
	        int a = 9, b = 36;
	        int[] arr = IntStream.rangeClosed(1, 100).toArray();
	       
	        
	        
	        
	        System.out.println(perfectSqures(arr));
	        
  }
	 
	 
	 public static int perfectSqures(int[] arr) {
		 int value = 0;
		
		 for(int i = 1; (i*i)<arr.length;i++) {
		      		
			 int answer = (int) Math.pow(i, 2);
			 System.out.println(answer);
			 
						 value = arr[i];
				 
		 }

		 	 
		 return value;
	 }
	 
	 
	 public static int xornum(int[] arr) {
		 int xor = 0;
		 for(int i = 0;i<arr.length;i++) {
			 xor ^= arr[i];
		 }
		 
		 return xor;
	 }
	}
	 
	






//Driver Code
	class PerfectSquares {
	   
		//static main code
		
//        PerfectSquares obj = new PerfectSquares();
//        System.out.print("Count of squares is " + (int)obj.countSquares(a, b));
  
		
		
		

//	    double countSquares(int a, int b)
//	    {
//	        return (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
//	    }
}

