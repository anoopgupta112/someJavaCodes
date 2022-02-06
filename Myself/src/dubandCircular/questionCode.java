package dubandCircular;


//question 3
public class questionCode{
	static Node head;
	static Node h1,h2;
	static class Node{
		int data;
		Node next,prev;
		Node(int d){
			this.data = d;
			next = prev = null;
		}
	}
	void devide() {
	
		if(head == null) {
			System.exit(0);
		}
		if(head.next == head) {
			System.out.print("NA");
		}
		else {
		int size = 0;
		int mid = 0;
		Node temp = head;
		while(temp.next != head){
		    temp = temp.next;
		    size++;
		}
		size++;
		if(size%2==0){
		    mid= (size/2);
		}
		else{
		    mid = (size/2)+1;
		}
		h1 = head;
		temp = head;
		for(int i = 1;i<mid;i++){
		    temp = temp.next;
		}
		h1 = head;
		h2 = temp.next;
		Node NTemp = temp;
		for(int i = mid;i<size;i++){
		    temp = temp.next;
		}
		NTemp.next = head;
		temp.next = h2;
	
		
			}
		
	}
	public void push(int new_data) {
		Node temp = head;
		Node newNode = new Node(new_data);
		if(head == null) {
			head = newNode;
			newNode.next = head;
			
		}
		else {
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}
	}
	void print(Node temp) {
		Node node = temp;
		if(temp != null) {
			do {
				System.out.print(node.data+" ");
				node = node.next;
			}
			while(node != temp);
			
			
		}
	}
	public static void main(String[] args) {
		questionCode list = new questionCode();
		int n = 5;
		int arr[] = {5, 3, 7, 8, 9};
		for(int i = 0;i<n;i++) {
			list.push(arr[i]);
		}
		list.devide();
		System.out.println();
		list.print(h1);
		System.out.println();
		list.print(h2);
		
	}
}
//question 2
/*
public class questionCode {
	Node head = null;
	 Node tail = null;
	 class Node {
	        //write your code here
	        int data;
	        Node next;
	      
	        public Node(int data) {
	            this.data=data;
	           
	          
	        }
	    }

	    // This method will push the input data at the end of the list
	    void push(int data) {
	        //write your code here
	        Node newNode= new Node(data);
	       
	        if(head==null){
	            head=newNode;
	            tail = newNode;  
                newNode.next = head;  
	        }
	        else{
	        	 tail.next = newNode;  
	        	  tail = newNode;  
	        	  tail.next = head;  
	        }
	        newNode.next=head;
	    }
	    void print() {
	        //write your code here
	    	   Node current = head;  
               if(head == null) {  
                  System.exit(0);
               }  
               else {  
                    
                         
            	   do{  
           
                       System.out.print( current.data+" ");  
                       current = current.next;  
                   }while(current != head);  
                   System.out.println();  
              
               }
               reverse(current);
	
}
	    
	    void reverse(Node current) {
	    	if(current.next == head) 
	    	{
	    		System.out.print(current.data+" ");
	    		return;
	    	}
	    	reverse(current.next);
	    	System.out.print(current.data+" ");
	    }
	    public static void main(String[] args) {
	    	questionCode obj = new questionCode();
	    	int n = 0;
	    	int[] arr = {};
	    	for(int i = 0;i<n;i++) {
	    		obj.push(arr[i]);
	    	}
	    	obj.print();
	    }
	    
}
*/
