package advancedata;

import java.util.Scanner;

import polyhw.Source;
//question 1
/*
public class dublyLinkedListCircular {
static Node head;
static class Node{
	int data;
	Node next;
	Node(int i){
		data = i;
		next = null;
	}
}
static dublyLinkedListCircular Insert(dublyLinkedListCircular list, int data) {
	Node new_node = new Node(data);
	new_node.next = null;
	if(list.head == null)
		list.head = new_node;
	else {
		Node last = list.head;
		while(last.next != head) {
			last = last.next;
			
		}
		last.next = new_node;
	}
	new_node.next = head;
	
	
	return list;
}
public static void main(String[] args) {
	dublyLinkedListCircular list = new dublyLinkedListCircular();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i =0;i<n;i++)
		list = Insert(list,sc.nextInt());
	int k = sc.nextInt();
	System.out.println(getNode(head,k).data);
	
}
public static Node getNode(Node head, int k) {
	int i =0;
	Node temp = head;
	while(i<k-1) {
		i++;
		
		head = head.next;
	
	}
	
return head;
}

}
*/



//question 2
public class dublyLinkedListCircular {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int i){
			this.data = i;
			next = null;
			
		}
	}
	public Node push(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		
		}
		else {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;}
	
		temp.next = newNode;}
		return head;
		
	}
	void  print() {
	
		Node temp = head;
	if(head != null) {
		
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
			
		}}
		
	}
	public static void main(String[] args) {
		dublyLinkedListCircular dl = new dublyLinkedListCircular();
		dl.push(4);
		dl.push(5);
		dl.print();
	}
}