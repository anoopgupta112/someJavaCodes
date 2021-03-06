package treeData;

import java.util.*;

//class representing Structure of node in the binary tree
class treeNode {
  int data;
  treeNode left, right;

  treeNode(int value) {
      data = value;
      left = null;
      right = null;
  }
}

public class source {
  treeNode rootNode;


  public static void main(String[] args) {

      source binaryTree = new source();

      Scanner in = new Scanner(System.in);

      //number of elements
      int n = in.nextInt(), element;

      //queue used to create a binary tree
      Queue<treeNode> q = new LinkedList<treeNode>();

      // creating a new binary tree. 
      binaryTree.rootNode = new treeNode(in.nextInt());
      q.add(binaryTree.rootNode);
      treeNode cur = null;
      for (int i = 1; i < n; i++) {

          cur = q.remove();

          //Note: if the element is -1 then the node is null
          element = in.nextInt();
          if (element != -1) {
              cur.left = new treeNode(element);
              q.add(cur.left);
          }
          i++;

          //Note: if the element is -1 then the node is null
          element = in.nextInt();
          if (element != -1) {
              cur.right = new treeNode(element);
              q.add(cur.right);
          }
        boolean b =   binaryTree.symmetric(binaryTree.rootNode);
        if(b==true) {
        	System.out.print(true);
        }
        else {
        	System.out.print(false);
        }
         
      }
    
  
 

  }


  boolean symmetric(treeNode rootNode){
      if(rootNode == null){
       return true;
       
      }
      return isMirror(rootNode.left, rootNode.right);
      
   }
  boolean isMirror(treeNode left, treeNode right)
  {
 

   
      if (left != null && right != null
          && left.data == right.data)
          return (isMirror(left.left, right.right)
                  && isMirror(left.right, right.left));

   
      return false;
  }



  
  
}
