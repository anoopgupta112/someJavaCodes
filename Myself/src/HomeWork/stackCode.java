package HomeWork;


import java.util.LinkedList;

import java.util.Queue;

class stackUsingNode{

public Node head;
class Node{
	int data;
	Node next;
	
}
public stackUsingNode() {
	this.head = null;
}
@SuppressWarnings("unused")
public void push(int val) {
	Node temp = new Node();
	 if(temp == null) {
		System.out.print("stack is null");
		return;
	}
	temp.data = val;
	temp.next = head;
	head = temp;
}

public boolean Empty() {
	return head == null;
}

public int peek() throws Exception{
	if(!Empty()) {
		return head.data;
	}
	else {
		throw new Exception("Stack is Empty");
		
	}
	
}
void pop () {
	if(head == null) {
		System.out.println("head is null");
	}
	head = head.next;
}
void print() {
	if(head == null) {
		System.out.println("head is null");
		
	}
	Node temp = head;
	while(temp != null) {
		System.out.println("data "+temp.data);
		temp = temp.next;
	}
	
}


}
//stack using queue------------
 class stackUsingQueue{
	
	 Queue<Integer> queue = new LinkedList<Integer>();
	 int size;
	stackUsingQueue() {
		 int size = 0;
	}
	 void push(int x) {
		size++;
		
		queue.add(x);
		
	
	}
	 void pop()
	{
		if(queue.isEmpty()) {
			return;
			}
			queue.remove();
			size --;
		
	}
	int head() {
		if(queue.isEmpty()) {
			return -1;
			
		}
		return queue.peek();
	}
	 int size() {
		return size;
	}
	
	
	
	
	
}
class stackCode{
	//stack using queue ---------
	
//	  public static void main(String[] args)
//	    {
//	        stackUsingQueue s = new stackUsingQueue();
//	        s.push(1);
//	        s.push(2);
//	        s.push(3);
//	 
//	        System.out.println("current size: " + s.size());
//	        System.out.println(s.head());
//	        s.pop();
//	        System.out.println(s.head());
//	        s.pop();
//	        System.out.println(s.head());
//	 
//	        System.out.println("current size: " + s.size());
//	    }
//	
	
	
	
	
	//stack using node-------------
	
	public static void main(String [] args)throws Exception {
	
	
		
		System.out.println("====================");
		stackUsingNode sc = new stackUsingNode();
		System.out.println(sc.Empty());
		sc.push(34);
		sc.push(65);
		sc.push(90);
		sc.push(78);
//		System.out.println(sc.peek());
		sc.print();
		sc.peek();
		sc.pop();
		sc.pop();
		System.out.println(sc.peek());
		sc.print();
		
		System.out.println(sc.Empty());
	}

	
	
	
}

