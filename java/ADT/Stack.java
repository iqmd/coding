public class Queue{
    LinkedList head;
    Queue(int data){
        this.head = new LinkedList(data);
    }

    public void enqueue(int data){
        head.addFirst(data);
    }
    public void dequeue(){
        head.removelast();
    }
    public boolean isEmpty(){
        return head.isEmpty();
    }
    public void printq(){
        head.print();
    }
}
