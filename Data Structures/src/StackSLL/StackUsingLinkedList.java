package StackSLL;

public class StackUsingLinkedList {
	Node top;
	
	StackUsingLinkedList(){
		this.top = null;
	}
	public void push(int val) {
		Node temp = new Node(val);
		temp.link = this.top;
		this.top = temp;
	}
	public void pop() {
		if(this.top == null) {
			System.out.println("Empty stack");
			return;
		}
		this.top = this.top.link;
	}
	public boolean isEmpty() {
		return this.top == null;
	}
	public int peek() {
		return this.top.data;
	}
	
	public int search(int e) {
		Node node = new Node();
		int pos = 0;
		node = this.top;
		while(node != null) {
			if(node.data == e) {
				return pos;
			}
			pos++;
			node = node.link;
		}
		return -1;
	}
	
	public void print() {
		Node curr = this.top;
		while(curr != null) {
			System.out.println(curr.data + " ");
			curr = curr.link;
		}
	}
}
