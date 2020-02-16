package QueueSLL;

public class QueueUsingLinkedList {
	Node head;
	QueueUsingLinkedList(){
		this.head = null;
	}
	public void Enqueue(int val) {
		Node temp = new Node(val);
		if(this.head == null ) {
			this.head = temp;
			return;
		}
		temp.next = null;
		
		Node last = head;
		while(last.next != null ) {
			last = last.next;
		}
		last.next = temp;
		return;
	}
	
	public int peek() {
		return this.head.val;
	}
	
	public void Dequeue() {
		this.head = this.head.next;
	}
	public String print() {
		String str = "";
		Node curr = new Node();
		curr = this.head;
		while(curr != null) {
			if(curr.next != null) {
				str+= curr.val + " <- ";
			}
			else {
				str+=curr.val;
			}
			
			curr = curr.next;
		}
		return str;
	}
}
