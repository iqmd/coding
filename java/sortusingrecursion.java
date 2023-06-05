import java.util.* ;
import java.io.*;
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        if(stack.empty()){
            return;
        }

        int temp = stack.pop();
        sortStack(stack);
        insert(temp);

	}
    public static void insert(int temp, Stack<Integer> stack){
        if(stack.empty() || stack.peek() < temp){
            stack.push(temp);
            return;
        }
        int elem = stack.pop();
        insert(elem,stack);
        stack.push(elem);
    }

}
