package queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


//question 3
/*
public class queueQus {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int n =12;
		int[] arr = {6, 12, 3, 4, 5, 1, 7, 8, 10, 9, 11, 2};
		while(n-- > 0) {
			queue.add(arr[n]);
			System.out.print(queue);
		}
		sort(queue);
	}
	static void sort(Queue<Integer> queue) {
		List<Integer> l = new ArrayList<Integer>();

	l.addAll(queue);
	

	Collections.sort(l);
	System.out.println();
	System.out.println(l);
	
	
	}
}
*/



//question 2  -- not complelted

public class queueQus {
	
	 static Queue<Integer> q1 = new LinkedList<Integer>();
     static Queue<Integer> q2 = new LinkedList<Integer>();


     static int size;

    queueQus()
     {
         size = 0;
     }
	
	void push(int x) {
	
	}
	
	  void pop()
      {

     
          if (q1.isEmpty())
              return;
          q1.remove();
          size--;
      }

      static int top()
      {
          if (q1.isEmpty())
              return -1;
          return q1.peek();
      }

      static int size()
      {
          return size;
      }
	
	
	
	
	
	
}

//question 1
/*
public class queueQus {
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
public static class Queue{
	Node front = null;
	Node rear = null;
	int deQueue(){
	  	if(front == null) {
    		System.out.println("null");
    		
    	}
	  	Node temp = front;
        front = front.next;
        
    	return temp.data;
		
	}
	void enQueue(int i) {
		
		Node temp = new Node(i);
		if(front == null) {
			front =  rear = temp;
			}
		rear.setNext(temp);
		rear = temp;
		
		
	}
}
public static void main(String[] args) {
	Queue Q = new Queue();
	int n = 4;
	int arr[] = {1,2,3,4};
	for(int i=0;i<n;i++) {
		Q.enQueue(arr[i]);
	}
	for(int i = 0;i<n;i++) {
		System.out.println(Q.deQueue());
	}
}
}
*/
