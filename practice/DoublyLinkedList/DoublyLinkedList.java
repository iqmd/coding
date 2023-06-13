public class DoublyLinkedList{
	Node head;
	Node tail;

	DoublyLinkedList(int data){
		this.head = this.tail = new Node(data);
	}

	class Node{
		int data;
		Node prev;
		Node next;

		Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

		
		public void insert(int data){

			Node node = new Node(data);

			if(head == null){
				head = tail = node; 
				return;
			}

			Node curr = head;

			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = node;
			node.prev = curr;
			tail = node;
		}

		public void print(){
			Node curr = head;

			while(curr != null){
				System.out.println(curr.data+" ");
				curr = curr.next;
			}
		}
	
		public void rprint(){
			Node curr = tail;

			while(curr != null){
				System.out.println(curr.data+" ");
				curr = curr.prev;
			}
		}
}
