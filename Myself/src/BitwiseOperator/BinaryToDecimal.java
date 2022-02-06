package BitwiseOperator;

public class BinaryToDecimal {
//101 -> 5
	
	public static void main(String[] args) {
		System.out.println("Decimal equvalent is: " + getDeicmal("0110"));
	}
	public static int getDeicmal(String binary) {
		
		int num = 0, len = binary.length(), pow = 1;
		for (int i = len -1; i>= 0; i--) {
			int digit = binary.charAt(i) - '0';
			System.out.println(digit);
			num += (digit*pow);
			pow <<=1;
		}
		return num;
		
		
		
		
		
	}

	    {
	        int x = 10;
	        int y = 5;
	 
	        // Code to swap 'x' (1010) and 'y' (0101)
	        x = x ^ y; // x now becomes 15 (1111)
	        y = x ^ y; // y becomes 10 (1010)
	        x = x ^ y; // x becomes 5 (0101)
	 
	        System.out.println("After swap: x = "
	                           + x + ", y = " + y);
	    }
}
