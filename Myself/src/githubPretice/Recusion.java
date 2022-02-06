package githubPretice;

public class Recusion {
	  public static void main(String[] args) throws Exception {
	   
//		     System.out.println(isPalindromeIterative("abcba"));
//		        System.out.println(isPalindromeIterative("abcda"));

		String str = "abc";
		char[] charArray = str.toCharArray();
		printStringPermutation(charArray, 0, charArray.length - 1);
	    }

	  public static void printStringPermutation(char[] str, int left, int right) {
		  if(left == right) {
			  System.out.println(str);
			  return;
		  }
		  
		  for(int i = left;i<=right;i++) {
//	TODO: swaping ith to lth char
			  swap(str,i,left);
//	TODO: permute string from l+1 to r
			  printStringPermutation(str, left+1, right);
//	TODO: swaping back ith char to left char
			  swap(str,i,left);
		  }
	  }
	  public static void swap(char[] str, int l, int r) {
		  char leftChar = str[l];
		  str[l]= str[r];
		  str[r]=leftChar;
	  }
	  
	  
	  
	  
	  
	  
	  
//	pretice 3--  checking palindrome ------------------
	  /*
	  public static boolean isPalindromeIterative(String str) {
		  boolean isPalindrome = true;
		  int l = 0, r = str.length()-1;
		  while(l<=r) {
			  if(str.charAt(l) != str.charAt(r)) {
				  isPalindrome = false;
				  break;
			  }
			  l++;
			  r--;
		  }
		  return isPalindrome;
	  }
	  
	
	  
	  public static boolean isPalindromeRevere(String str) {
		  return str.equals(new StringBuilder(str).reverse().toString());
	  }
	    */
	  
	  
	  
	  
	  
//	  pretice 2 (factorial)---------------------
	  /*
	  public static int factRecursive(int n) {
		  
		  if(n == 1 || n == 0) {
			  return 1;
		  }
		  else {
			  return n* factRecursive(n-1);
		  }
	  }
	  
	  public static int factIterative(int n) {
		  int res = 1;
		  for(int i = 2;i<=n;i++) {
			  
			  res *= i;
			  
		  }
		  return res;
	  }
	  
	  public static int tailFactorial(int n, int res) {
		  if(n==0 || n == 1) {
			  return res;
		  }
		  else {
			  return tailFactorial(n-1, res*n);
		  }
	  }
	  */
	  
	  
	  
	  
	  
	  
	  
//	  pretice 1---------------------------
	
	  public static int fibonacci(int n) throws Exception{
		
		  if(n<0) {
			  throw new Exception("n is negative");
		  }
		  if(n==0) {
			  return 0;
		  }
		  else if(n ==1) {
			  return 1;
		  }
		  else
		  
		    return fibonacci(n-1)+fibonacci(n-2);
		
	  
	  }
	private static int fibonacciTail(int n, int res1, int res2) throws Exception {
		if(n<0) {
			throw new Exception("n is negative");
		}
		if(n ==0) 
			return res1;
		else if (n==1)
			return res2;
		else
		    return fibonacciTail(n-1, res2, res1+res2);
	} 
	  
	  
	  
}
