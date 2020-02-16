package QueueSLL;

public class Node {
	Node next;
	int val;
	
	Node(){
		this.val = 0;
		this.next = null;
	}
	
	Node(int val){
		this.val = val;
		this.next = null; 
	}
}
