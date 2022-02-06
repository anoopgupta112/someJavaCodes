package HomeWork;

import java.util.LinkedList;
import java.util.Stack;

public class stackForBracket {
public static void main(String[] args) {
	String str = "[()]";
	Stack<Character> st= new Stack<Character>();
	int i=0;
	int j =str.length();
	while(i<str.length()) {
		st.push(str.charAt(i));
		
//		System.out.println(st.pop());
		
		if(str.charAt(i)  == str.charAt(j)) {
			
			System.out.println("fine");

			
		}
		else {
	
			System.out.println("error");
			break;
			
		}
		i++;
		j = str.length()-1-j;
	}
}
}
