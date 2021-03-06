package stack;



//question 4
/*
public class codingQus{
	public static class Node{
		private char data;
		private Node next;
		Node(char data){
			super();
			this.data = data;
		}
		public char getData() {
			return data;
		}
		public void setData(char data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	public static class Stack{
		Node head;
		public Stack() {
			super();
			head = null;
			
		}
		public boolean isEmpty() {
			return head == null;
		}
		public void push(char data) {
			Node temp = new Node(data);

			
			temp.setNext(head);
			head = temp;
		}
		public char pop() {
			if(head == null) {
				return '\0';
			}
			char data = head.getData();
			head = head.getNext();
			return data;
		}
		public char peek() {
			if(!isEmpty()) {
				return head.data;
			}
			else {
				System.out.println(" ");
				return '\0';
			}
		}
	}
	
	public static String findDuplicateParenthesis(String inputString) {
		Stack s = new Stack();
		
		 
		 
	        // Iterate through the given expression
	        char[] str = inputString.toCharArray();
	        for (char ch : str) {
	          
	            if (ch == ')') {
	               
	                char top = s.peek();
	                s.pop();
	 
	              
	                int elementsInside = 0;
	                while (top != '(') {
	                    elementsInside++;
	                    top = s.peek();
	                   s.pop();
	                }
	                if (elementsInside < 1) {
	                    return "present";
	                }
	            } 
	          
	            else {
	                s.push(ch);
	            }
	        }
	 
	    
	        return "absent";
		
	
	
		
	}
	public static void main(String[] args) {
	
		String s = new String();
		s = "(909)";
		System.out.println(codingQus.findDuplicateParenthesis(s));
	}
	
	
	
	
}
*/

//question 3
/*
public class codingQus{
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		int n = 4;
		int arr[] = {9,1,0,2};
		while(n-- > 0)
			stack.push(arr[n]);
			sort(stack);
		
		
	}
	
	public static void PrintStack(Stack<Integer> s)
	{
	  Stack<Integer> temp = new Stack<Integer>();
	   
	  while (s.empty() == false)
	  {
	    temp.push(s.peek());
	    s.pop();
	  }  
	 
	  while (temp.empty() == false)
	  {
	    int t = temp.peek();
	    System.out.print(t + " ");
	    temp.pop();
	 
	    // To restore contents of
	    // the original stack.
	    s.push(t); 
	  }
	}

	static void sort(Stack<Integer> stack) {
	Stack<Integer> temp = new Stack<>();
	while(!stack.isEmpty()) {
		int temp2 = stack.pop();
		
		
		while(!temp.isEmpty() && temp.peek()>temp2) {
			stack.push(temp.pop());
		}
		temp.push(temp2);
		
		
	}
	
	
	String spar = "";
	System.out.print("[");
	for(int i: temp) {
		
		System.out.print(spar+i);
		spar =", ";
	}
	System.out.print("]");
	
		
	}
	
}
*/
		

//question 2

/*
public class codingQus{
	
	
	
	public static Stack <Integer> sortStack(Stack<Integer> Input){
		
		Stack<Integer> temp = new Stack<Integer>();
		while(!Input.isEmpty()) {
			int temp2 = Input.pop();
			
			
			while(!temp.isEmpty() && temp.peek()>temp2) {
				Input.push(temp.pop());
			}
			temp.push(temp2);
			
			
		}
		
	
	
		return temp;
		
	}
	
	public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
	
		if(!sortedStack.isEmpty()) {
			int i = 2;
			while(i<=k) {
				sortedStack.pop();
				if(i==k) {
					System.out.println(sortedStack.pop());
				}
				i++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Stack <Integer>  inputStack = new Stack<Integer>();
		int n = 4;
		int arr[] = {4,2,0,3};
		for(int i = 0;i<n;i++) {
			inputStack.add(arr[i]);
		}
		if(inputStack.isEmpty()) {
			System.out.println("empty stack");
			System.exit(0);
		}
		int k = 4;
		if(k>inputStack.size()) {
			System.out.print("Invalid input");
			System.exit(0);
		}
		Stack <Integer> temp = sortStack(inputStack);
		findKthLargestNum(temp, k);
		
	}
	
	
	
	
}
*/

//question 1
/*
public class codingQus{
	public static class Node{
		private int data;
		private Node next;
		Node(int data){
			super();
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}
	public static class Stack{
		public Node head;
		public Stack() {
			this.head = null;
		}
	
	
		void push(int val) {
			
			Node temp = new Node(val);
			
			temp.data = val;
			temp.next = head;
			head = temp;
				
		}
		int pop() {
			Node t = null;
			if(head == null) {
				return -1;
				
			}
			t = head;
			head = head.next;
			return t.data;
		
			
		}
		int peek() {
			if(head == null)
				return -1;
		
		return head.data;
	
	
		
		}
	
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		
		int n = 5;
		int arr[] = {5, 6, 4, 3, 1};
		for(int i = 0;i<n;i++) {
			s.push(arr[i]);
		}
		int topElement = s.peek();
		if(topElement != -1) {
			System.out.println(topElement);
			}
			for(int i = 0;i<n;i++) {
				System.out.println(s.pop());
			
		}
		
		
		
	}
}

*/



