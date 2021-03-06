package hwCodes;



public class singleyLinkedList {
//singleyLinkedList
	public Node head;
	class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			next = null;
		}
	}
	public singleyLinkedList() {
		this.head = null;
	}
	//append
	public Node append(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
		return head;
		
	}
	//insert at position --incompleted 
	void insert()
	{
		int pos = 3;
		Node add = new Node(20);
		if(pos ==0) {
			add.next = head;
			head = add;
			return;
		}
		
		
	}	
	// Traverse the list
	public void printList() {
		Node temp = head;

		if(head != null) {
			while(temp != null) {
				System.out.println(temp.val+" ");
				temp = temp.next;
			}
		}
		System.out.println();
	}
	
	//delete node
	 public Node deleteFromEnd(){ 
	        if(head == null){
	          System.out.println("head is null");
	        }
	        if(head.next == null){
	            head = null;
	        }
	        else{
	            // Get the second last node
	            Node temp = head;
	            while(temp.next.next != null){
	                temp = temp.next;
	            }
	            // update the next pointer of second last element to null
	            temp.next = null;
	        }

	        return head;
	    }

	    // Time complexity: O(1)
	    public boolean isEmpty(){
	        return head == null;
	    }
	//delete element from given index
	   public void deleteNodeAtGivenIndex(int index) {
	        // Write your code here
		   if(head== null) return;
		   Node temp = head;
		   int counter =1;
		   while(counter <= index && temp.next != null) {
			 
			   if(counter == index) {
				 
				   Node temp2 = temp.next.next;
				   temp.next = null;
				   temp.next = temp2;
				   
			   }
			   temp = temp.next;
			   counter++;
		   }
	    }
	   
	   public void printMiddleElement() {
		     if(head== null) return;
		     if(head.next == null)
		    	 System.out.print(head.val);
		    int counter = 1;
		     int mid = 1;
		     Node temp = head;
		    Node temp2 = head;
		   
		     while(temp2.next != null){
		         counter++;
		         temp2 = temp2.next;
		     }
		     while(counter/2 >= mid && temp.next != null) {
		    	 System.out.println(mid+"mid");
		    	 if(counter/2 == mid ) 
		    		 System.out.println(temp.next.val);
		    		 
		    	 
		   
		    	
		    	
		    	
		    	 mid++;
		    	
		    	 temp= temp.next;
		    	
		    	 
		    	
		     }
		  
	   }
		    
	   
	public static void main(String[] args) {
		singleyLinkedList sll = new singleyLinkedList();
	        System.out.println(sll.isEmpty());
	        sll.printList();
	        sll.append(7);
	        sll.append(6);
	        sll.append(5);
	        sll.append(1);
	        sll.append(39);
	        sll.append(8);
	       
	   
	        sll.printList();

//	        sll.deleteFromEnd();
//	        sll.printList();
//	      sll.deleteNodeAtGivenIndex(2);
//	        sll.printList();
	        sll.printMiddleElement();
//	        System.out.println(sll.isEmpty());
	   
	     
	}
	
}
