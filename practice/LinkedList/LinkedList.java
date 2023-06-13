class LinkedList{
	class Node {
		int data;
		Node next = null;

		Node(int data){
			this.data = data;
		}
	}

	Node head;
	LinkedList(int data){
		this.head = new Node(data);
	}

	public void add(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return;
		}
		Node curr = head;

		while(curr.next != null){
			curr = curr.next;
		}

		curr.next = node;

	}

	public void pop(){
		if(head == null){
			System.out.println("List empty");
			return;
		}
		if(head.next == null){
			head = null;
			return;
		}

		Node curr = head;
		Node prev = null;
		while(curr.next != null){
			prev = curr;
			curr = curr.next;
		}
		prev.next= null;
		
	}

	public void print(){
		Node curr = head;

		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}
