public class Stack{
		int size;
		int top = -1;
		int stack[];
		Stack(int size){
			this.size = size;
			stack = new int[size];
		}

		public boolean isEmpty(){
			return top == -1;
		}

		public void push(int data){
			stack[++top] = data;
		}

		public int pop(){
			return stack[top--];
		}

		public void print(){
			for(int i=0; i <=top; i++){
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}

}
