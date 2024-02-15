import java.util.ArrayList;
class Stack {
    private ArrayList<Integer> array = new ArrayList<>();
    private int top = -1;

    public void push(int data){
        array.add(data);
        top++;
    }
    public void pop(){
        array.remove(top);
        top--;
    }

    public int top(){
        if(top < 0){
            System.out.println("Stack empty");
        }
        return array.get(top);
    }
}
