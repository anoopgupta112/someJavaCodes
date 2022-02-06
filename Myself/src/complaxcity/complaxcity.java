package complaxcity;

public class complaxcity {
	public static void main(String[] args) {
	int i = 0;   //space will = 1 and time will 0
	for (i = 10;i>1;i--) {
//		System.out.println(i);  // time complaxcity will 10 (n+1) and space will 1
		
		for( int j = 1;j<i;j++) {
//			System.out.print(j); // time complaxcity will {n(n+1) or O(n^2) and space will 2
		}
	}
	
	
	
	System.out.println(Math.sqrt(2));
	}

}
