package DoublyLinked2;

public class DoublyLinked {
	Node head, tail;
	int size;
	
	DoublyLinked(){
		this.size =0;
		this.head = this.tail = null;
	}
	public void push(int val) {
		Node node = new Node(val);
		if(head == null ) {
			node.next = node.prev =null;
			head = node;
		}
		else {
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;
		}
	}
	
	public String printList() {
		Node curr = head;
		String str = "";
		while(curr != null) {
			if(curr.next != null ) {
				str+= curr.val+" -> ";
			}
			else {
				str+= curr.val;
			}
			curr = curr.next;
		}
		return str;
	}
}
