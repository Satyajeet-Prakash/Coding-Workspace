package Stack_Queue;

public class Stack_LinkedList_Implementation {
	
	static Stack root;
	
	static class Stack{
		int data;
		Stack next;
		Stack(int data) {
			this.data = data;
		}
	}
	
	boolean isEmpty() {
		if(root == null)
			return true;
		else
			return false;
	}
	boolean push(int x){
		
		Stack newNode = new Stack(x);
		
		if(root == null)
			root = newNode;
		else {
			Stack temp = root;
			newNode.next = temp;
			root = newNode;
		}
		System.out.println(x + " pushed into Stack.");
		return true;
	}
	int pop() {
		int popped = Integer.MIN_VALUE;
		
		if(root == null)
			System.exit(0);
		else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}
	int peek() {
		
		if(root == null)
			System.exit(0);
	
		return root.data;
	}
	
	public static void main(String[] args) {
		
		Stack_LinkedList_Implementation stack = new Stack_LinkedList_Implementation();
		
		stack.push(123);
		stack.push(178);
		stack.push(140);
		
		System.out.println(stack.pop() + " popped out of Stack.");
		System.out.println("\nElement at the top of Stack: " + stack.peek());
	}
	
}
