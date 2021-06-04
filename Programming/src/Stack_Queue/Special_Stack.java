package Stack_Queue;

import java.util.*;

public class Special_Stack 
{
	static Stack<Integer> stack = new Stack<>();
	static Stack<Integer> auxilary = new Stack<>();
	
	boolean push(int x)
	{
		if(auxilary.isEmpty())
			auxilary.push(x);
		
		stack.push(x);
		
		System.out.println(x + " pushed into Stack\n");
		
		if(x < auxilary.peek())
			auxilary.push(x);
		
		return true;
	}
	
	int pop()
	{
		int x = stack.peek();
		stack.pop();
		auxilary.pop();
		
		System.out.println(x + " popped out of Stack.\n");
		return x;
	}
	
	int getMin() {
		return auxilary.peek();
	}
	public static void main(String[] args)
	{
		Special_Stack s = new Special_Stack();
		
		s.push(17);
		s.push(26);
		s.push(15);
		s.push(78);
		s.push(9);
		
		System.out.println("Minimum Value in the Stack: " + s.getMin() + "\n");
		s.pop();
		System.out.println("Minimum Value in the Stack: " + s.getMin() + "\n");
		
	}
}
