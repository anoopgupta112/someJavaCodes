package hwCodes;

public class hwdate20 {

public static int multiplyBy7(int num) {
	int x= 2;
	System.out.println((x<<2)-x);
	System.out.println((x<<=3));
		num=(num <<3)-num;
		
		return num;
	}
	public static void main(String args[]) {
		int res=multiplyBy7(12);
		System.out.println(res);
	}

	
	
		
	
}

