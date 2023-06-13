public class Main{
	public static void main(String args[]){
		Stack mystack = new Stack(5);
		mystack.push(34);
		mystack.push(22);
		mystack.push(78);
		mystack.push(92);
		mystack.print();
		System.out.println(mystack.pop() + " is popped from the stack.");
		mystack.print();
		
	}
}
