package polyhw;

public class Operators implements Operator {
	
	

	public static final Operator ADDITION = new Operator() {
		   public int operate(int a, int b) {
		       return a+b;
		   }
		   
		};
		
		public static final Operator SUBTRACTION = new Operator() {
			public int operate(int a,int b) {
				return a-b;
			}
			
		};
		public static final Operator MULTIPLICATION = new Operator() {
			public int operate(int a,int b) {
				return a*b;
			}
			
		};
		public static final Operator DIVISION = new Operator() {
			public int operate(int a,int b) {
				return a/b;
			}
			
		};

	@Override
	public int operate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}


	
}

	