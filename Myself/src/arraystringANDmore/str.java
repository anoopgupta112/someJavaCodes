package arraystringANDmore;

public class str {
	public static void main(String[] args) {
	String s1 = "abc";
	String s2 = new String("abc");
	String s3 = new String("Abc");
	
	System.out.println("Does s1 & s2 refer the same string? " +(s1 ==s2));
	 // .eqals(), .eqalsIgnoreCase() - for string comparison
	System.out.println("Is s1 & s2 are same ? "+ s1.equals(s2));
	System.out.println("Is s1 & s3 are same? "+ s1.equalsIgnoreCase(s3));
	System.out.println("------------------------");
	
	//.length() - length of String
	System.out.println("Length of the string s1 is? "+ s1.length());
	System.out.println("------------------------");
	
	//charAt(index i) - return character at index i[0 based of index]
	System.out.println("0th character of the string s1 is : "+ s1.length());
	System.out.println("------------------------");

	
	//.toUpperCase(), .toLowerCase() -> convert the string to upper case/lower case latter respectively
	 System.out.println("The upper case conversion of s1: "+s1.toUpperCase());
	 System.out.println("The lower case conversion of s3: "+ s3.toLowerCase());
		System.out.println("------------------------");
//.indexOf, .lastIndexOf -> index of a string/character inside another string
		System.out.println("index of bc in s1: "+ s1.indexOf("bc"));
		System.out.println("Index of a in s1: "+ s1.indexOf('a'));
		System.out.println("---------------------");
		
		//.concat() -> For string concatenation
		System.out.println("Concatention of s1 & s3 : "+ s1.concat(s3));
		System.out.println("---------------------");

	//.subString(index) - take substring from beginning index o last index(optional)
		System.out.println("substring from 1 " + s1.substring(2));
		System.out.println("---------------------");

	//.replace("oldstr","newStr"),.replaceAll("oldStr","newStr")
		System.out.println("replacing 'a' with 'x' in s1: "+ s1.replace('a', 'x'));
        System.out.println("--------------------------------------------");

	//.compareTo(s1), .compareToIgonreCase(s2) 
		System.out.println("Comparing \"cbc\" with " +s1+" : "+"cdc".compareTo(s1));
		  System.out.println("Comparing \"acc\" with "+s1+" : "+ "acc".compareTo(s1));
	        System.out.println("Comparing \"acd\" with "+s1+" : "+ "acd".compareTo(s1));
	        System.out.println("Comparing "+s1+" with "+s3+" : "+ s1.compareTo(s3));
	        System.out.println("Comparing "+s1+" with "+s3+" : "+ s1.compareToIgnoreCase(s3));
	        System.out.println("--------------------------------------------");
	
   // .contains(str2) -> check wheterh the given input string is substring or not
	        System.out.println("Does "+s1+" contains \"ab\" ? "+ s1.contains("ab"));
	        System.out.println("--------------------------------------------");
	   //.trim() -> removes extra spaces from left & right
	        System.out.println(" Trimming \"   Abc  \" : |"+"   Abc  ".trim()+"|");
	        System.out.println(" Trimming \"   Abc  \" : |"+"   Abc  ".replace(" ","")+"|");
	        System.out.println(" Trimming \"   Abc  \" : |"+"   Abc  ".replaceAll(" ","")+"|");
	        System.out.println("--------------------------------------------");

	    // .split(delimiter) -> split the string based on a delimiter
	        System.out.println("Splitting \"a,b,c,d\" by comma : ");
	        String[] sar = "a,b,c|d".split(",");
	        for (String s: sar) {
	            System.out.println(s);
	        }
	    // .join() -> printing array as a string with given delimiter
	        System.out.println("Joining sar array : "+ String.join("|", sar));

	//end here
	        
	        
	        
	        
//	float num = 10.23432f;
	
//	String numString = ""+ num;
	

	
//	StringBuffer sb = new StringBuffer("upgrad");
//	sb.append("d");
//	sb.append("R");
//	System.out.println(sb);
//	float j = 43.301432f;
//	float i = Float.parseFloat("11.0000");
//	System.out.println(i);
//	System.out.println(j);
//	System.out.println(numString);
//	
//	int m = 4;
//	String result = (m%2 == 1)? "Odd":"Even";
//	System.out.println(result);

	
	
	}



}
