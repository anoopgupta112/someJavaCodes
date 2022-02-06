package BitwiseOperator;

public class countSetbits {

	public static void main(String[] args) {
	

		System.out.println("Set bit count: " +getSetBitCount(7) );
		System.out.println("diffrent bit count: " +diffrentSetbits(8, 7) );

	}
	public static int getSetBitCount(int n) {
		int count = 0, pow = 1;
		for (int i =0 ; i<32;i++) {
			if((n & pow)> 0) {
				count++;
			}
			pow <<= 1;
		}
		
		return count;
	}
	
	public static int diffrentSetbits(int n1, int n2) {
		
		 int XOR = n1 ^ n2;
		 int count = 0;
		for(int i = 0;i<32;i++) {
			
		     while(XOR>i) {
		    XOR = XOR & (XOR - 1);
		       count++;
		     }
			
		}
		
		
		return count;
	}
}


//if((( n1 >> i) & 1) != ((n2 >> i) & 1)) {
//	count++;
//}
