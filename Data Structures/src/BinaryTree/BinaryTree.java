package BinaryTree;

public class BinaryTree {	
	Node root;
	
	BinaryTree(int val ){
		this.root = new Node(val);
		 
	}
	
	BinaryTree(){
		this.root = null;
	}
	
	private Node insert(Node node, int data) {
		if(node == null ) {
			return new Node(data);
		}
		if(data < node.val) {
			node.left = insert(node.left,data);
		}
		else if(data > node.val) {
			node.right = insert(node.right,data);
		}
		return node;
	}
	public void add(int val) {
		this.root = insert(this.root, val);
	}
	
	void postOrderPrinter(Node node) {
		if(node == null) {
			return;
		}
		
		postOrderPrinter(node.left);
		
		postOrderPrinter(node.right);
		
		System.out.println(node.val + " ");
		
	}
	void preOrderPrint(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.val);
		
		preOrderPrint(node.left);
		
		preOrderPrint(node.right);
	}
	void inOrderPrint(Node node) {
		if(node == null) {
			return;
		}
		inOrderPrint(node.left);
		System.out.println(node.val);
		inOrderPrint(node.right);
	}
	
	
}
