package SinglyLinked2;

public class Node {
	Node next;
	int val;
	
	Node(){
		this(0);
	}
	Node(int val){
		this.next = null;
		this.val = val;
	}
}
