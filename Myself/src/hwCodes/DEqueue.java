package hwCodes;


import java.util.ArrayList;
import java.util.List;

public class DEqueue {

    private List<Integer> elements;
//    private queue<Integer> que = new queue<Integer>();
    public DEqueue() {
    	elements = new ArrayList<>();
    }
    //time Complexity O(1)
  //checking empty or not
    public boolean isEmpty()
    {
    	return elements.isEmpty();
    }    
//    adding data in first position
    public void enqueue(int data) {
    	elements.add(0,data);
    }
    //deleting form starting
    public int dequeue() throws Exception{
    	if(isEmpty()) {
    		throw new Exception("Queue is already empty");
    		
    	}
    	int front = elements.get(0);
    	elements.remove(0);
    	return front;
    	
    }
    
    
    
    void prepend(int data) {
    	elements.add(0,data);
    }
    //deleting from end
   public int deleteformEnd() throws Exception {
    	if(isEmpty()) {
    		throw new Exception("queue is already empty");
    		
    	}
    	int rear = elements.get(elements.size()-1);
    	elements.remove(elements.size()-1);
    	
    	return rear;
    }
    public static void main(String[] args) throws Exception {
    	DEqueue dq = new DEqueue();
    	
    	dq.prepend(23);
    	dq.prepend(45);
    	dq.prepend(76);
    	dq.prepend(6);
    	dq.prepend(90);
    	dq.enqueue(43);
//printing which value is deleting
    	 System.out.println(dq.isEmpty()); 
    	  System.out.println(dq.dequeue()); 
     	  System.out.println(dq.dequeue()); 
     	  System.out.println(dq.dequeue()); 
     	  System.out.println(dq.dequeue()); 
          System.out.println(dq.deleteformEnd()); 
          System.out.println(dq.deleteformEnd());

          System.out.println(dq.isEmpty()); 
    	
    }
	 
	 
}
