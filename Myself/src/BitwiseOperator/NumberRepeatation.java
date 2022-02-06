package BitwiseOperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberRepeatation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,2,1};
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(43);
		numbers.add(42);
		numbers.add(45);
		numbers.add(48);
		numbers.add(40);
		numbers.add(49);
		numbers.add(32);
		numbers.add(54);
		numbers.add(89);
		
		Collections.sort(numbers, Collections.reverseOrder());
		
		numbers.forEach(n -> System.out.println(n+ ' '));
		System.out.println(getSingleNumber(arr));
	}
	public static int getSingleNumber(int[] arr) {
		int xor = 0;
		for(int i = 0; i<arr.length;i++) {
			xor =xor^arr[i];
		//	System.out.println(xor+" "+i+" " + arr[i]);

		}
		return xor;
	}
}
//can you explain it again, I know what xor does