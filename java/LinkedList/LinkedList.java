class LinkedList{
    Node head;
    LinkedList(int data){
        this.head = new Node(data);
    }
    LinkedList(){
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
            System.out.print(curr.data);
            if(curr.next != null){
                System.out.print("->");
            }
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

    public void bubblesort(){
        Node flag, curr;
        flag = head;
        while(flag != null){
            curr = head;
            while(curr.next != null){
                if(curr.data > curr.next.data){
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                }
                curr = curr.next;
            }
            flag = flag.next;
        }
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}

