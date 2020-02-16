package QueueSLL;

public class Main {

	public static void main(String[] args) {
		QueueUsingLinkedList queue = new  QueueUsingLinkedList();
		queue.Enqueue(5);
		queue.Enqueue(4);
		queue.Enqueue(3);
		queue.Enqueue(2);
		queue.Enqueue(1);
		System.out.println(queue.print());
		System.out.println("-------------");
		System.out.println("Now popping: " +queue.peek());
		System.out.println("---------------");
		queue.Dequeue();
		System.out.println(queue.print());
		System.out.println("--------------");
		System.out.println("Now popping: " +queue.peek());
		
	}

}
