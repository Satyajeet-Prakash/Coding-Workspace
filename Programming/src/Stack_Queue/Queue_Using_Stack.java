package Stack_Queue;

import java.util.*;

class Queue_Using_Stack2 {
	 
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	
	void enQueue(int x) {
		stack1.push(x);
		System.out.println(x + " is inserted in queue.\n");
	}
	
	int deQueue() {
		
		int x;
		
		if(stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is Empty.\n");
			System.exit(0);
		}
		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}

public class Queue_Using_Stack {

	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();
	
	void enQueue(int x)
	{
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(x);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	int deQueue()
	{
		if(s1.isEmpty()) {
			System.out.println("Queue is Empty");
			System.exit(0);
		}
		
		int x = s1.peek();
		s1.pop();
		return x;
	}
	
	public static void main(String[] args) 
	{
		Queue_Using_Stack queue1 = new Queue_Using_Stack();
		Queue_Using_Stack2 queue2 = new Queue_Using_Stack2();
		
		queue2.enQueue(12);
		queue2.enQueue(19);
		queue2.enQueue(26);
		
		System.out.println(queue2.deQueue() + " removed from queue.\n");
		System.out.println(queue2.deQueue() + " removed from queue.\n");
	}

}
