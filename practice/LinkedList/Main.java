public class Main{
	public static void main(String args[]){
		LinkedList list = new LinkedList(25);
		list.add(32);
		list.add(12);
		list.print();
		System.out.println();
		list.pop();
		list.pop();
		list.pop();
		list.pop();
		list.print();

	}
}
