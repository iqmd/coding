public class Main{
	public static void main(String args[]){
		DoublyLinkedList list = new DoublyLinkedList(25);
		list.insert(32);
		list.insert(12);
		list.insert(10);
		list.insert(90);
		list.print();
		System.out.println();
		list.rprint();

	}
}
