package Stack_Queue;

public class Stack_Array_Implementation 
{
	static int MAX = 100;
	int[] arr = new int[MAX];
	int top = 0;
	
	boolean isEmpty() {
		
		return (top < 0);
	}
	boolean push(int x){
		
		if(top == MAX-1) {
			System.out.println("Stack OverFlow.");
			System.exit(0);
		}
		arr[++top] = x;
		System.out.println(x + " pushed into Stack.");
		return true;
	}
	int pop() {
		
		if(top < 0) {
			System.out.println("Stack UnderFlow.");
			System.exit(0);
		}
		int x = arr[top];
		top--;
		return x;
	}
	int peek()
	{
		if(top < 0) {
			System.out.println("Stack UnderFlow.");
			System.exit(0);
		}
		return arr[top];
	}
	
	
	public static void main(String[] args) {
		
		Stack_Array_Implementation stack = new Stack_Array_Implementation();
		
		stack.push(12);
		stack.push(19);
		stack.push(35);
		
		System.out.println(stack.pop() + " popped out of Stack.");
		System.out.println("\nElement at top of Stack: " + stack.peek());
	}
}
