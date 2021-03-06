package HomeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
//question 2 HW
class SLLNodeHw {
    Node head;

//class to create nodes.
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    
//    question 3
    /*
    void noRepeat() {
    	  HashSet<Integer> hs = new HashSet<>();

        
          Node current = head;
          Node prev = null;
          while (current != null) {
              int curval = current.data;

            
              if (hs.contains(curval)) {
                  prev.next = current.next;
              }
              else {
                  hs.add(curval);
                  prev = current;
              }
              current = current.next;
          }
       
    }
    */

    // Below methods would help you create a singly linked list.
    // inserts a new node at the end of the list.
    public void insert(int new_data) {
        Node temp = head;
       
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    // Method that will print the linked list.
 
      void  fun(Node head){
    	 Node temp = head;
    	  if (temp == null)
    	      return;
    	  fun(temp.next);
    	  System.out.print(temp.data + " ");
    	}
    void print_list(Node head) {
    	
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        if(head == null){
            System.out.print("");
        }
       
    }
    
   
       // recursive reverse Node
    Node recursiveReverse(Node current, Node prev) {
    	if(current == null ) {
    		
    		return prev;
    		
    	} 
    	if(current.next == null) return current;
    	prev = current.next;
    	prev = recursiveReverse(current.next, prev);
    	 System.out.println(prev.data);
    	Node headNext = current.next;
    	headNext.next = current;
    	current.next = null;
    	return prev.next;  
      }
    public static void main(String[] args) {
       SLLNodeHw obj = new SLLNodeHw();
        Scanner in = new Scanner(System.in);

        int n = 4;

        obj.insert(1);
        obj.insert(3);
        obj.insert(3);
        obj.insert(4);
        
//        obj.noRepeat();
      obj.recursiveReverse(obj.head, null);
        obj.print_list(obj.head);
       
       
    }

   
}

