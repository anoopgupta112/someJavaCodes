package HomeWork;

public class RecursionCodeHw {

	public static int function() {
		int i = 1;
	        if (i <= 5) {
	            System.out.print(i++ + " ");
	            function();
	           
	        }
	        return 0;
	    }
	 
	 public static void sum(int n){
		 String s=String.valueOf(n);
		 if(n>=s.length()) {
			int value =  s.charAt(1)+s.charAt((s.length()-s.length())+1);
			System.out.println(value);
		 }
	 }
	 
	 
	 public static void main(String[] args) {
		 RecursionCodeHw hw = new RecursionCodeHw();
//		 int n = 543;
//		 
		
		
		 
	 
//		System.out.println(func(5, 3));
//		 fun(4);
		
//		 hw.function();
//		 System.out.println(sum(4));
//		 System.out.println(evenSum(9));
//		 System.out.println(evenSum2(9));
		
		 
	 }
	 /*
	 static void fun(int x){
		   if(x>0){
		       fun(--x);
		       System.out.print(x+" ");
		       fun(x--);
		   }
		}
	 */
	 
	 
	 /*
	 public static void func(int n){    
		   if(n<=1){
		       System.out.print(n);
		   }
		   else {
		       System.out.print(n%2);
		       func(n/2);
		   }
		}
	 */
	 
	 
	 
//	 This Question form mcq of recursive----------------------------

//	  private static int sum(int n) {
//		    if (n == 1) return n;
//		    return n + sum(n - 1);
//		}
	 public static int func(int x, int n) {
	       if (n == 0) {
	           return 1;}
	       else if(n%2 == 0) {
	  		 System.out.println(" dddd ");

	           return func(x*x, n/2);}
	       else
	    	   System.out.println(" ddddddhgfd ");
	           return x*func(x*x, n/2);
	}
	
	 
	 
	
//	 public static int evenSum(int n) {
//		   if(n <= 1) {
//		       return 0;}
//
//		   else if (n % 2 == 0) {
//		       return n + evenSum(n - 1);}
//		   else
//		       return evenSum(n - 1);
//		}
//	 private static int evenSum2(int n){
//		   return (n/2)*(1 + n/2);
//		} 
//		
}
