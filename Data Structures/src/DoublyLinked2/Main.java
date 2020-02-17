package DoublyLinked2;

public class Main {

	public static void main(String[] args) {
		DoublyLinked dl = new DoublyLinked();
		dl.push(0);
		dl.push(1);
		dl.push(2);
		System.out.println(dl.printList());
	}

}
