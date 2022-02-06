package treeData;

import java.util.Scanner;

//binary Tree
public class BinaryTree {
static Scanner sc = null;
	public static void main(String[] args) {
	sc = new Scanner(System.in);
	
		Node root = CreateTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		PostOrder(root);
		System.out.println();
	}
	// it will return root
	static Node CreateTree() {
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		System.out.println("Enter left for : "+data);
		root.left = CreateTree();
		System.out.println("Enter Right for : "+data);

		root.right = CreateTree();
		return root;
	}
	static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		
		preOrder(root.right);
	}
	static void PostOrder(Node root) {
		if(root == null) return;
		PostOrder(root.left);
		
		PostOrder(root.right);
		System.out.print(root.data+" ");
	}
	
}
class Node{
	Node left, right;
	int data;
	public Node(int data) {
		this.data = data;
	}
}
