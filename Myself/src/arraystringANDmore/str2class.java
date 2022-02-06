package arraystringANDmore;

public class str2class {
	public static void main(String[] args) {
printPrimeFactors(10);
	
	}
//	time compexity: n
	public static void printPrimeFactors(int n) {
		
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
			if(i != n/i && isPrimeNumber(n/i)) {
				System.out.println(n/i);
			}
		}
	}


//time complexity: O(sqrt(n))
public static boolean isPrimeNumber(int n) {
	boolean isPrime = true;
	n = Math.abs(n);
	if(n == 0|| n == 1)
		return false;
	for(int i =2;i<=Math.sqrt(n); i++) {
		if(n %i == 0) {
			isPrime = false;
			break;
		}
	}
	return isPrime;
}
}