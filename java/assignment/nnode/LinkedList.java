public class LinkedList {

    Node head;

    LinkedList(int data){
        head = new Node(data);
    }

    class Node{
        int data;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    void add(int data){
        Node newNode = new Node(data);
        if(head.next == null){
            head.next = newNode;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    void print(){
        Node curr = head;

        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void remove(int k){
        
    }
}