package marrigeDate;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Strings {
	public static void main(String[] args) {
//		String a = new String("upgrad");
//	    String b = new String("upgrad");
//	    String d = null;
//		String c = "new one ";
//		c = c + "acg ";
//		c = c.concat("working");
//		System.out.println(c.toCharArray());
//	
//		System.out.println(a ==b);
//		System.out.println(a.equals(b));
//		System.out.println(a.compareTo(c));
//		System.out.println(d);
		
		
		
//		homework of string--------------
		
		Scanner sc = new Scanner(System.in);
//		
//		String trying = "helo this is me";
//		int counter = 0;
//		char s = sc.next().charAt(0);
//		for (int i = 0; i<trying.length();i++) {
//			char tr = trying.charAt(i);
//			if(tr==s) {
//				
//				 counter++;
//
//			}
//		}
//		System.out.println(counter);
		
//		or 2ndway-----------------------------
		
		
//		int counter2 = 0;
//		String sen[] = {"hello it me anoop"};
//		char s = sc.next().charAt(0);
//		for(int i =0;i<sen.length;i++) {
//			
//			if(sen[i].equals(s)) {
//				counter2++;
//				System.out.println("working");
//			}
//		}
//		System.out.println(counter2);   not working
		

		
//		-----------------end
//		String input = sc.next();
//		 String resu="";
//		    char ch;
//		       for (int i=0; i<input.length(); i++)
//		      {
//		        ch= input.charAt(i); 
//		        resu = ch+resu; 
//		      }
//		      System.out.println(resu); 
		
		
//		
//		String admin = "anoop";
//		
//		  if(input.equals(admin)){
//	            System.out.println("Welcome Admin");
//	        }
//	        else{
//	            System.out.println("Access Denied");
//	        }
//		String a = "hello I'm anoop";
//		int b = 342;
//	    String d = "heo";
//		String c = String.format(a, d);
//		System.out.print(c);
		
//		
//		String str="25.4";
//		float n = 23.3f;
//		float num = Float(str);
//		System.out.println(n + num);
//		
		
		
		
//		  boolean check = false;
//		  int[] numberArray = {1,15,90,40,35,63,79,88,20};
//			int n = sc.nextInt();
//
//		  for (int i =0; i<numberArray.length; i++) {
//
//		  if(n==numberArray[i]){
//	            System.out.println(i+1);
//	            check = false;
//	        }
//		  else {
//			  check = true;
//		  }
//		  
//		  }
//		  if(check) {
//			  System.out.println("not found");
//		  }
//		  
//		
		
		
		
//		int[][] arr = {
//			     {1,2},
//			     {3,4}
//			};
//		for (int i=0; i< arr.length; i++){
//			  for(int j=0; j<arr.length; j++){
//			     System.out.println(arr[i][j]);
//			  }
//			}
		
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		int[] arr2 = {1,2,3};
//		
//		for(int i = 0;i<arr.length;i++) {
//			for(int j=0; j<arr2.length;j++) {
//				
//				int k = arr[i]*arr2[j];
//				if(k>20) {
//					System.out.println(k);
//				}
//			}
//		}
		
		
		int n=7;
		for(int i=3;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int j=(n-i)*2;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=(n*2)-1;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=(n*4)-1;k>=i*2;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		String Tnx="one by one";
		Timer timer = new Timer();

		
		 
		

		     
		     
		      
			timer.schedule(new TimerTask() { 
				   public void run() { 
					   for(int i =0;i<Tnx.length();i++) {
					   System.out.print(Tnx.charAt(i));
					  
					   }
					   
				   
				  
				   }
				},  4000 );
			
			
////			String Tnx="one by one";
//
//		       for(int i = 0; ;i+= 1000){
//		            System.out.println(Tnx);
//		            Thread.sleep(1000 + i);
//		       }
//		       
					
		  	
	}

}
