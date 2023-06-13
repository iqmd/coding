class LinkList{
    Node head;
    LinkList(int data){
        this.head = new Node(data);
    }

    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("No Item in list !!");
        }
        Node curr;
        curr = head;
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }

    public void removelast(){
        if(head.next == null){
            head = null;
            System.out.println("List is empty ! Cannot remove from an empty List");
        }else{
            Node curr = head;
            Node prev = null;
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
        }
    }

    public void removefirst(){
        if(head == null){
            System.out.println("List is empty ! Cannot remove from an empty List");
        }else{
            head = head.next;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    public void reverseIt(){
        Node next = null;
        Node prev= null;
        while(head.next != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            
        }
        head.next = prev;
        
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
	    LinkList ll = new LinkList(23);
	    ll.add(44);
	    ll.add(12);
	    ll.add(15);
	    ll.print();
    }
}

