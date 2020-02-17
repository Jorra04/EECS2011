package DoublyLinked2;

public class Node {
	Node prev,next;
	int val;
	
	Node(){
		this(0);
	}
	Node(int val){
		this.val = val;
		this.prev = this.next = null;
	}
}
