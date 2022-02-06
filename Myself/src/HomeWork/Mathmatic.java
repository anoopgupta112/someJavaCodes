package HomeWork;


import java.util.List;

public class Mathmatic {
public static void main(String[] args) {
//	question 3
	/*
int num = 121;
palidrome(num);
*/

	
//	question 4
	int num =10;
	boolean isper = false;
	if(perfectNum(num)==1) 
		isper = true;
	System.out.println(isper);
	
	
	
}
//question 4 --code is right but upgrad question is wrong

public static int perfectNum(int num) {
	int sum = 1;

	for(int i = 2;i<=num-1;i++) {
		if(num%i==0) {
			sum += i;
			
		}
	}


	 if((sum) == num ){
         sum=1;
   }
	
   else{
       sum =2 ;
   }

	
	return sum;
	
	
	
	
//	int sum = 1;
//for(int i = 2;i<=num-1;i++) 
//	if(num%i==0) 
//	    sum = sum + i;
//
//
//	return sum;
}






//	question 3 homework code
/*
public static void palidrome(int num) {
	String s = String.valueOf(num);
	int j = 0;
	int[] numarr = new int[s.length()];
	
	for(int i = s.length()-1;i>=0;i--) {
		int k = Character.getNumericValue(s.charAt(i)); 
		
		numarr[j] = k;
		j++;
	}
	  StringBuilder builder = new StringBuilder();
	for(int i: numarr) {
		builder.append(i);
	}
	 int number = Integer.parseInt(builder.toString());
	if(number== num) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
}
*/
}
