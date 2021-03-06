package HomeWork;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

class MyTreeNode{
    int data;
    MyTreeNode left;
    MyTreeNode right;
    

    MyTreeNode(int data){
        this.data = data;
    }
}

public class TreeExample {
//    public static void main(String[] args) {
//        MyTreeNode root = new MyTreeNode(1);
//        root.left = new MyTreeNode(2);
//        root.right = new MyTreeNode(3);
//        root.right.right = new MyTreeNode(7);
//        root.right.left = new MyTreeNode(6);
//        root.right.left.right = new MyTreeNode(6);
//        root.right.left.right.left = new MyTreeNode(5);
//        root.left.left = new MyTreeNode(4);
//        root.left.right = new MyTreeNode(5);
//      
//        
//System.out.print(heightPrint(root));
////        printInorder(root);
////        System.out.println( );
////        System.out.println( "pre Order " );
////        preOrder(root);
////        System.out.println( );
////        System.out.println( "Post Order " );
////        PostOrder(root);
//    }
   
	// tree-----------2
    public static void main(String[] args) {
    	  MyTreeNode root = new MyTreeNode(1);
    	  root.left = new MyTreeNode(2);
    	  root.left.left = new MyTreeNode(3);
    	  root.left.right = new MyTreeNode(4);
    	  root.left.right.right = new MyTreeNode(5);
    	  root.right = new MyTreeNode(6);
    	  root.right.left = new MyTreeNode(7);
    	  root.right.right = new MyTreeNode(8);
//    	  int value = 9;
//    	  System.out.print(searchInTree(root, value));
//    	  LevlWise(root);
System.out.println(Min(root));   
System.out.println(Max(root)); 
    }

    public static int Max(MyTreeNode root) {
    	if(root == null) return 0;
    	if(root.right == null)
    		return root.data;
    	return Max(root.right);
    }
    public static int Min(MyTreeNode root) {
    	if(root == null) return 0;
    	if(root.left==null) {
    		return root.data;
    	}
    	
    	
    	return Min(root.left);
    	
    }
    //check github
    public static void LevlWise(MyTreeNode root) {
    	Queue<MyTreeNode> q =new LinkedList<>();
    	if(root != null) 
    	q.add(root);
    	while(!q.isEmpty()) {
    		MyTreeNode node = q.poll();
    		System.out.print(node.data+" ");
    		if(node.left != null) 
    			q.add(node.left);
    		if(node.right != null) 
    			q.add(node.right);
    		
    		
    	}
    	
    	
    }
    static boolean searchInTree(MyTreeNode root, int value) {
    	if(root==null) {
    		return false;
    	}
    	
    	if(root.data==value) {
    		return true;
    	}
    	boolean leftSearch=searchInTree(root.left,value);
    	if(leftSearch) {
    		return true;
    	}
    	boolean rightSearch=searchInTree(root.right,value);
    	return  leftSearch||rightSearch;
    }
    
    
    
// In-order
    static void printInorder(MyTreeNode root){
        if(root==null) return;
        printInorder(root.left);
        System.out.print(root.data+ ", " );
        printInorder(root.right);
    }

	static void preOrder(MyTreeNode root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		
		preOrder(root.right);
	}
	static void PostOrder(MyTreeNode root) {
		if(root == null) return;
		PostOrder(root.left);
		
		PostOrder(root.right);
		System.out.print(root.data+" ");
	}

	static int heightPrint(MyTreeNode root) {
		int countleft = 0;
		int countRight =0;
	
	if(root == null)  return 0;
	else 
	if(root.left != null) 
		countleft =1+ heightPrint(root.left);
	
	
	 if(root.right != null) 
		countRight= 1+ heightPrint(root.right);
	
	
	
	return Math.max(countRight, countleft);
		
		
	}
	
}
