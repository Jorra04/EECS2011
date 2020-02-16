package StackSLL;

public class Main {
	/*
	 * A class that tests the linked list 
	 * implementation of a stack.
	 */

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.print();
		System.out.println("-------------");
		System.out.println(stack.search(4));

	}

}
