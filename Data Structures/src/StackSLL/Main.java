package StackSLL;

public class Main {

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
