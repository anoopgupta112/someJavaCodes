package treeData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


import polyhw.Source;

public class treeCodeQuestion {
	
	class treeNode{
		int data;
		treeNode left;
		treeNode right;
		
		public treeNode(int ele) {
			data = ele;
			left = null;
			right = null;
		}
	}

	
	
    public static int calculateMedian(int[] parent){
    	
    	
    	for(int i= 0;i<parent.length;i++) {
    		System.out.print(parent[i]);
    	}
    	return 0;
    }
    void preorder() {
		
	}
    void postOrder() {
		
   	}
    void inOrder() {
		
   	}

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M;
        M=scan.nextInt();
        int[] parent = new int[M];
        for(int j=0;j<M;j++){
            parent[j]=scan.nextInt();
        }
        int result;
        result = calculateMedian(parent);
        System.out.print(result);
        return ;
    }
}

/*
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    public treeNode(int element) {
        data = element;
        left = null;
        right = null;
    }
}

class treeCodeQuestion {
    static treeNode rootNode;

    public static void main(String args[]) {
        //creating a binary tree
        treeCodeQuestion tree = new treeCodeQuestion();

        //root node of the binary tree
        treeNode rootNode;

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary tree. 
        rootNode = new treeNode(in.nextInt());
        q.add(rootNode);
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
            element = in.nextInt();
            //Note: if the element is -1 then the node is null
            if (element != -1) {
                cur.right = new treeNode(element);
                q.add(cur.right);
            }
        }
      System.out.println(rootNode.data);
        tree.printleft(rootNode);
     
        
       
        //write your code here


    }
    void printleft(treeNode rootNode) {
    	if(rootNode == null)return;
    	if(rootNode.left == null) return;
    	System.out.println(rootNode.data);
    	printleft(rootNode.left);
    	printleft(rootNode.right);
    
    	
    	
    	
    	
    	
    }
}
*/

