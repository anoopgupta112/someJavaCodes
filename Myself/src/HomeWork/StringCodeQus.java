package HomeWork;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringCodeQus {
public static void main(String[] args) {
//	qustion 1
//	System.out.println(reverse("Welcome"));
	
//	question 2
//	System.out.println(isPalindrome("itin"));
	
	
//	question3
	/*
	String str = "abc";
     stringPermutations(str, 0, str.length()-1);
     */
	
//	question 4
//	System.out.println(removeChars("the", "had"));
     
//     homework 2 question
	String str =  "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
	int k = 6;
//     kthNonRepeatingCharacter(str, k);
   char index =  kthNonRepeatingCharacter(str, k); 
   if(index == '0') {
	   System.out.println("NA");}
   else {
   System.out.println(index);}
   
 
  
     /* calculate count of characters
        in the passed string */
    
     
}
//home work 2 question--wrong


static char kthNonRepeatingCharacter(String str, int k) {

	
	
	 Set<Character> repeating = new HashSet<>();
	 List<Character> nonRepeating = new ArrayList<>();
	 for (int i = 0; i < str.length(); i++) 
	 {
		 char letter = str.charAt(i);
	 if (repeating.contains(letter))
	 { 
		 continue; 
	 }
	 if (nonRepeating.contains(letter)) 
	 { 
		 nonRepeating.remove((Character) letter);
	 repeating.add(letter);
	 } 
	 else 
	 {
		 nonRepeating.add(letter);
	 } 
	 }
	 if(k == nonRepeating.size()+1) {
		 return '0';
	 }
		 
	 return nonRepeating.get(k-1); 
	 }

   
	

    







//question 4
/*
static String removeChars(String str, String secStr) {
	

	str = str.toLowerCase();
	secStr = secStr.toLowerCase();
	for(int i = 0;i<=str.length()-1;i++) {
	for(int j = 0;j<= secStr.length()-1;j++) {
	
		if(str.charAt(i) == secStr.charAt(j) ) {
		
			str = str.replaceAll(Character.toString(str.charAt(i)), "");
		}
		
		
	}

	}
	
	return str;
 }
*/


//question 3

public static  void stringPermutations(String str, int left, int right) { 
	 

	
	 
	if(left == right) {
		
		System.out.println(str);
		return;
	}
	else {
	for(int i = left; i<= right;i++) {
		str = swap(str,left,i);
		
		stringPermutations(str, left+1, right);
		str = swap(str,left,i);
	}
	}
	}
public static String swap(String str, int l, int r) {
	char[] c = str.toCharArray();
	char leftChar = c[l];
	c[l] = c[r];
	c[r]= leftChar;
	return String.valueOf(c);
}





//question 2
/*
public static boolean isPalindrome(String str) {


StringBuilder str1 = new StringBuilder(str);
StringBuilder n = str1.reverse();


if(n.toString().contains(str1.reverse())) {

	return true;
	}

return false;

	}

*/


//question 1
/*
public static String reverse(String str) {
	  StringBuilder str1 = new StringBuilder(str);

		str1.reverse();

	
	return str1.toString();
	}
	*/
}
