package HomeWork;



public class StringHwAndCode {
	
	
	
public static void main(String[] args) {
//	question 1 
	/*
	String str1 = "education";
	String str2 = "rate";
	System.out.println(removeCommanChar(str1,str2));
	*/
		
	
//	mcq 1
//	String a = "UPGRAD";
//
//	String b = new String("UPGRAD");
//
//	String c = "UPGRAD";
//
//
//	System.out.println(a == b);
//
//	System.out.println(a == c);
	
//	mcq 2
//	String s = " COVID times are boring!    ";
//	s = s.trim();
//	System.out.println(s.length());
//	
//	char[] array = {53, 66, 67, 68};
//	System.out.println(new String(array));
	
//	String s = String.join("b","c","d","e");
//	System.out.println(s);
	
	
	String s = "HELLO";
	String ans = "";
	for(int i = 0; i < s.length(); i++) {
		ans += (char)(s.charAt(i) + 32);
	}
	System.out.println(ans);
	
//	question 2
	String str = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
	int k = 5;
//	 kthNonRepeatingCharacter(str, k);
}	
//question 2 -- not solved
/*
static void kthNonRepeatingCharacter(String str, int k) {
  for (int i = 0;i<str.length();i++) {
	  str.replaceAll(str, "k");
	  System.out.println(str);
  }
	
	
	
}


*/

// question 1 homework of String ----
/*
	static String removeCommanChar(String str1, String str2) {
		
	for(int i = 0;i<str1.length();i++) {
			for(int j = 0;j<str2.length();j++) {
			     if(str1.charAt(i) == str2.charAt(j)) {
				str1 = str1.replaceAll(Character.toString(str1.charAt(i)), "");
			
				}
	}
		}
		return str1;
	}
	*/
}








