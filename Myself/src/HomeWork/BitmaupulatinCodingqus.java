package HomeWork;


public class BitmaupulatinCodingqus {
	
	
	

public static void main(String[] args) {
	//question 1  -------1------------
//	System.out.println(numberOfSetBits(7)); 
	
	

	
//question 2------------2---------
//System.out.println(reverseBit(5));
	
	
	
//	Question 3-------------3------------
	System.out.println(subBits(9, 5));

}

//Question 1------------------1---------------------
/*
public static int numberOfSetBits(int num) {
	int count=0;
	for(int i = 0; i< 32;i++) {
		
		if((num & (1<<i)) != 0) {
			count++;
		}
	}
	return count;
} 
*/



//Question 2 -----------------2------------------
/*
public static int reverseBit(int num) {
	int bit = 0;
	 	while(num > 0 ) {
		 bit <<= 1;
	
		 if ((num & 1) == 1) {
             bit ^= 1;
             }
             num >>= 1;
              }
	 	
	return bit;
} 
*/


//Question 3

public static int subBits(int num1, int num2) {
	
	int n1 = ~num2+1;
	int result = n1 + num1;
	
	
	return result;
}


 }
