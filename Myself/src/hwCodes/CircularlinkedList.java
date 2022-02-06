package hwCodes;



public class CircularlinkedList {
public Node head;
 int value = 5;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
		next= null;
	}
}
public CircularlinkedList(){
	this.head = null;
}
//time complaxity O(n)
public void append(int val) {
	//create a new Node
	Node newNode = new Node(val);
//	if the list is empty
	if(head == null) {
		head = newNode;
	}
	else {
		//get the last node
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		//Update last node's next pointer to the new node
		temp.next = newNode;
		
	}
	newNode.next = head;
}

//time complexity O(n)
//traverse the list and print each element in the order
public void printlist() {
	Node temp = head;
	
	if(head != null) {
		while(temp.next != head) {
			System.out.print(temp.val+" ");
			value ++;
			temp = temp.next;
		}
		System.out.println(temp.val + " ");
	}
	System.out.println();
}


//josheff rule

public void joceff(int Kpos) {

	Node temp = head;
	int winner = value;
	
	while(winner > 1) {
		
		 for(int i = 0;i<=Kpos;i++) {
			while(temp.next != temp) {
				
			}
		       
		       
		      
		 }
		
	
	}
	}

public void delete_kposCode(int Kpos) {
	
}
public static void main(String[] args) {
	CircularlinkedList cll = new CircularlinkedList();
	cll.append(12);
	cll.append(54);
	cll.append(64);
	cll.append(98);
	cll.printlist();
	cll.joceff(3);
	cll.printlist();
}

}
