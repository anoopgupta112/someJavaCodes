package HomeWork;

import java.util.ArrayList;
import java.util.List;

import hwCodes.printallnum;

class questions_sum{
	/*  sum----------------of digits
	public static int sum(int n) {
		if(n<10) 
		 return n;
		
		return (n%10)+sum(n/10);
		
		
	}
*/
	
	//	question 3
	/*
	 public static int palindrome(int num, int i) {
	      //write the logic here  
	      if(num ==0)
	          return i;
	   
	  i = (i * 10) + (num%10);
	 
	    return palindrome(num/10, i);
	   
	      
	    }
	    */
	
//	question 4 --
	  static void reverseInteger(int n) {
		  String s = String.valueOf(n);
			 
		  StringBuilder sb = new StringBuilder(s);
		  StringBuilder k= sb.reverse();
		  if(n<0) {
		
				
				 
				  if(sb.charAt(sb.length()-1)=='-') {
				 sb.delete(sb.length()-1, sb.length());
					 System.out.print('-');
					 s = String.valueOf(sb);
					 int j = Integer.valueOf(s);
					 System.out.print(j);
				  }
				 
			  
		  }
		
		  else if(k.charAt(0) == '0' && n>0) {
		  
		       s=  s.replaceAll("0", "");
		       int j = Integer.valueOf(s);
		      
			  System.out.print(j);
			  }
		  else {
		 
		
		  if(n==0) {
				 
			  return;
		  }
		   
		  int reverse = 0;   
		  int lastDigit = 0;   
		  
		  lastDigit = n % 10; 
		  reverse = reverse * 10 + lastDigit;   
		  
		
		  System.out.print( reverse);

		  
		
		  
			
		
	 reverseInteger(n/10);}
		 
	   
	    
	  }
	  public static int negToPos(int val) {
		  return val;
	  }
}


public class recoursive {
	
	
	public static void main(String[] args) {
		
//		System.out.println(questions_sum.sum(2165));
//		int j = questions_sum.palindrome(98789,0);
//		System.out.println(j);
		questions_sum.reverseInteger(100030);
		
		
	}


	

}
