public class Main
{
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(7);
        stack.push(8);
        stack.push(2);
        stack.push(9);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());

    }
}
