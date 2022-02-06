package githubPretice;

import java.util.ArrayList;
import java.util.List;

 class stacksForCode {
private List<Integer>  elements;

public stacksForCode(){
	elements = new ArrayList<>();
}

public boolean isEmpty() {
	return elements.isEmpty();
}
public void push(int data) {
	elements.add(data);
}
//time complexity O(1)
public int peek() throws Exception{
	if(isEmpty()) {
		throw new Exception("Stack is already empty");
		
	}
	return elements.get(elements.size()-1);
}

public int pop() throws Exception {
	if(isEmpty()) {
		throw new Exception("Stack is already empty");
		
	}
	int lastIndex = elements.size()-1;
	int last = elements.get(lastIndex);
	return last;
			
}
public void print() {
	if(!isEmpty()) {
		int i = 0;
		while(elements.size()-1>i) {
			System.out.println(elements.get(i));
			
			i++;
		}
			
		
	}
}


}
class stacks{
	public static void main(String[] args) throws Exception{
		 stacksForCode stack = new stacksForCode();
		 stack.push(3);
		 stack.push(8);
		 stack.push(12);
		 stack.push(25);
		 stack.pop();
		 stack.push(98);
		 
		 stack.push(78);
		 stack.pop();
		 
		
		 stack.print();
		 System.out.println("-------------");
		 System.out.println(stack.peek()+1);
		// stack.pop();
		 System.out.println(stack.peek());
		// stack.pop();
		 System.out.println(stack.peek());
		// stack.pop();


		 System.out.println(stack.isEmpty());




		}
}