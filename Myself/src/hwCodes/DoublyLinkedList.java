package hwCodes;

import org.w3c.dom.Node;

public class DoublyLinkedList {
private Node head;
private Node tail;
class Node{
    int val;
    Node next;
    Node prev;
    
    Node(int val){
    	this.val = val;
    	next = null;
    	prev = null;
    	
    }
}
public DoublyLinkedList() {
	this.head = null;
	this.tail = null;
}
//Time Complaxity
public void append(int val) {
	//create new node
	Node newNode = new Node(val);
//	if the list is empty
	if(head == null) {
		head = newNode;
	}
	else {
		tail.next = newNode;
		newNode.prev = tail;
	}
	tail = newNode;
}

public void printList() {
	//Traverse the list
	Node temp = head;
	if(head != null) {
		while(temp != null) {
			System.out.println(temp.val+ " ");
			temp = temp.next;
			
		}
	}
	System.out.println();
}
//time complexity O(1)
public void deleteFromEnd() throws Exception{
	if(head == null) {
		throw new Exception("list is already empty");
	}
	

		if(head.next == null) {
			head = null;
			tail = null;
	
	}
		else {
			Node secondLastNode = tail.prev;
			secondLastNode.next = null;
			tail = secondLastNode;
		}
		
}
// Time complexity: O(1)
public boolean isEmpty(){
    return head == null;
}

public void insertAtPos(int data, int pos) {
	Node newNode = new Node(data);
	if(pos < 1) {
		System.out.println("invalid");
	}
	else if(pos == 1) {
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	else {
		int i = 1;
		Node temp = head, previous = null;
		while(i<pos) {
			previous = temp;
			temp = temp.next;
			i++;
			
		}
		previous.next = newNode;
		newNode.prev = previous;
		
		newNode.next = temp;
		if(temp != null) {
			temp.prev = newNode;
		}
		else {
			tail = newNode;
		}
	}
}
public static void main(String[] args) throws Exception{
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.append(2);
    dll.append(23);
    dll.append(9);
    dll.append(17);
    dll.deleteFromEnd();
    dll.printList();
    dll.insertAtPos(15, 3);
    dll.printList();
}
}
